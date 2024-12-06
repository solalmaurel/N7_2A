// Time-stamp: <28 oct 2022 10:06 queinnec@enseeiht.fr>

public interface Allocateur {

    AllouerOK[N]
    
     /** Demande à obtenir `demande' ressources. */
    public void allouer(int demande) throws InterruptedException {
        if !(demande<=nbDispo) {
            AllouerOK[demande].await;
        }
        nbDispo-=1;
        réveille_chaine
    }
    
    /** Libère `rendu' ressources. */
    public void liberer(int rendu) throws InterruptedException {
        nbDispo+=rendu
        réveille_chaine
    }
    
    réveille_chaine {
        i = 1
        while i<=nbDispo && AllouerOK[i] vide {
            i++
        }
        if i<= nbDispo
            AllouerOK[i].signal()
    }
    /** Chaîne décrivant la stratégie d'allocation. */
    public String nomStrategie();
}
