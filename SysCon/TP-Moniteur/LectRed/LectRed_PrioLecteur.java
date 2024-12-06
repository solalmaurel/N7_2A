// Time-stamp: <11 oct 2024 08:19 Philippe Queinnec>

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import Synchro.Assert;

/** Lecteurs/rédacteurs
 * stratégie d'ordonnancement: priorité aux lecteurs,
 * implantation: avec un moniteur. */
public class LectRed_PrioLecteur implements LectRed
{

    /** Verrou support du moniteur */
    private Lock mon;
    /** Variables conditions du moniteur */
    private Condition lectureOK;
    private Condition ecritureOK;

    private int nbRa; //nombre de rédacteurs en attentes
    private int nbL; //nombre de lecters en cours
    private boolean R; //ecriture en cours
    
    public LectRed_PrioLecteur() {
        this.mon = new ReentrantLock ();
        this.lectureOK = mon.newCondition();
        this.ecritureOK = mon.newCondition();
        this.R = false;
    }

    public void demanderLecture() throws InterruptedException {
        mon.lock();
        while (nbRa!=0 || R) {
            lectureOK.await();
        }
        nbL++;
        lectureOK.signal();
        mon.unlock();
    }

    public void terminerLecture() throws InterruptedException {
        mon.lock();
        nbL--;
        if (nbL==0) {
            ecritureOK.signal();
        }
        mon.unlock();
    }

    public void demanderEcriture() throws InterruptedException {
        mon.lock();
        while (nbL!=0 || R) {
            nbRa++;
            ecritureOK.await();
            nbRa--;
        }
        R=true;
        mon.unlock();
    }

    public void terminerEcriture() throws InterruptedException {
        mon.lock();
        R=false;
        if (nbRa > 0) {
            ecritureOK.signal();
        } else {
            lectureOK.signal();
        }
        mon.unlock();
    }

    public String nomStrategie() {
        return "Stratégie: Priorité Lecteurs.";
    }
}
