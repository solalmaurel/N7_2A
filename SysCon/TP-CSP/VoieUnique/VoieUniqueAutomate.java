// Time-stamp: <06 jui 2023 11:58 Philippe Queinnec>

import CSP.*;

/** Réalisation de la voie unique avec des canaux JCSP. */
/* Version par automate d'états */
public class VoieUniqueAutomate implements VoieUnique {

    enum ChannelId { EntrerNS, EntrerSN, Sortir };
    
    private Channel<ChannelId> entrerNS;
    private Channel<ChannelId> entrerSN;
    private Channel<ChannelId> sortir;
    
    public VoieUniqueAutomate() {
        this.entrerNS = new Channel<>(ChannelId.EntrerNS);
        this.entrerSN = new Channel<>(ChannelId.EntrerSN);
        this.sortir = new Channel<>(ChannelId.Sortir);
        (new Thread(new Scheduler())).start();
    }

    public void entrer(Sens sens) {
        System.out.println("In  entrer " + sens);
        switch (sens) {
          case NS:
            entrerNS.write(true);
            break;
          case SN:
            entrerSN.write(true);
            break;
        }
        System.out.println("Out entrer " + sens);
    }

    public void sortir(Sens sens) {
        System.out.println("In  sortir " + sens);
        sortir.write(true);
        System.out.println("Out sortir " + sens);
    }

    public String nomStrategie() {
        return "Automate";
    }

    /****************************************************************/
    enum Etat { Libre, PassageNS, PassageSN }
    class Scheduler implements Runnable {
        private Etat etat = Etat.Libre;
        private int nbtrainsNS = 0; // uniquement si etat = PassageNS
        private int nbtrainsSN = 0; // uniquement si etat = PassageSN
        public void run() {
            var altLibre = new Alternative<>(entrerNS, entrerSN);
            var altPassageSN= new Alternative<>(sortir, entrerSN);
            var altPassageNS= new Alternative<>(sortir, entrerNS);
            while (true) {
                if (etat == Etat.Libre) {
                    switch (altLibre.select()) {
                        case EntrerNS:
                            entrerNS.read();
                            etat = Etat.PassageNS;
                            nbtrainsNS ++;
                            break;
                        case EntrerSN:
                            entrerSN.read();
                            etat = Etat.PassageSN;
                            nbtrainsSN ++;
                            break;
                    }
                } else if (etat == Etat.PassageNS) {
                    switch (altPassageNS.select()) {
                        case EntrerNS:
                            entrerNS.read();
                            nbtrainsNS ++;
                            etat = Etat.PassageNS;
                            break;
                        case Sortir:
                            sortir.read();
                            nbtrainsNS --;
                            if (nbtrainsNS == 0) {
                                etat = Etat.Libre;
                            }
                            break;
                    }
                } else if (etat == Etat.PassageSN) {
                    switch (altPassageSN.select()) {
                        case EntrerSN:
                            entrerSN.read();
                            nbtrainsSN ++;
                            etat = Etat.PassageSN;
                            break;
                        case Sortir:
                            sortir.read();
                            nbtrainsSN --;
                            if (nbtrainsSN == 0) {
                                etat = Etat.Libre;
                            }
                            break;
                    }
                }
            }
        }
    } // class Scheduler
}

