// Time-stamp: <06 jui 2023 11:59 Philippe Queinnec>

import CSP.*;

/** Réalisation de la voie unique avec des canaux JCSP. */
/* Version avec condition d'acceptation */
public class VoieUniqueCondition implements VoieUnique {

    enum ChannelId { EntrerNS, EntrerSN, Sortir };
    
    private Channel<ChannelId> entrerNS;
    private Channel<ChannelId> entrerSN;
    private Channel<ChannelId> sortir;
    
    public VoieUniqueCondition() {
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

    public String nomStrategie () {
        return "Condition";
    }

    /****************************************************************/

    class Scheduler implements Runnable {
        boolean libre = true;
        int trainsNS = 0;
        int trainsSN = 0;
        public void run() {
            var geNS = new GuardedChannel<>(entrerNS, () -> (trainsSN == 0) && libre && (trainsNS < 3));
            var geSN = new GuardedChannel<>(entrerSN, () -> (trainsNS == 0) && (libre) && (trainsSN < 3));
            var gSortir = new GuardedChannel<>(sortir, () -> (trainsNS != 0) || (trainsSN != 0));
            var alt = new Alternative<>(geNS, geSN, gSortir);
            while (true) {
                switch (alt.select()) {
                    case EntrerNS:
                        entrerNS.read();
                        trainsNS ++;
                        break;
                    case EntrerSN:
                        entrerSN.read();
                        trainsSN ++;
                        break;
                    case Sortir:
                        if (trainsNS != 0) {
                            sortir.read();
                            trainsNS --;
                        } else {
                            sortir.read();
                            trainsSN --;
                        }
                        break;
                }
            }
        }
    } // class Scheduler
}

