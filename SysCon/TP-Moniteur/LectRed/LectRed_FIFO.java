// Time-stamp: <11 oct 2024 08:19 Philippe Queinnec>

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import Synchro.Assert;

/** Lecteurs/rédacteurs
 * stratégie d'ordonnancement: FIFO;
 * implantation: avec un moniteur. */
public class LectRed_FIFO implements LectRed
{

    /** Verrou support du moniteur */
    private Lock mon;
    /** Variables conditions du moniteur */
    private Condition lectureOK;
    private Condition ecritureOK;
    private Condition Rprio;
    private boolean RprioEmpty;

    private int nbL; //nombre de lecters en cours
    private boolean R; //ecriture en cours

    /** file d'attente */
    private LinkedList<Condition> file;
    
    public LectRed_FIFO() {
        this.mon = new ReentrantLock ();
        this.Rprio = mon.newCondition();
        this.RprioEmpty = true;
        this.R = false;
        this.file = new LinkedList<Condition>();
    }

    public void demanderLecture() throws InterruptedException {
        mon.lock();
        Condition lectureOK = mon.newCondition();
        file.add(lectureOK);

        while (!file.isEmpty() || R) {
            lectureOK.await();
        }
        nbL++;
        file.remove().signal();
        mon.unlock();
    }

    public void terminerLecture() throws InterruptedException {
        mon.lock();
        nbL--;
        if (nbL==0) {
            if (RprioEmpty) {
                file.remove().signal();
            } else {
                Rprio.signal();
            }
        }
        mon.unlock();
    }

    public void demanderEcriture() throws InterruptedException {
        mon.lock();
        Condition ecritureOK = mon.newCondition();
        file.add(ecritureOK);

        while (nbL!=0 || R || !file.isEmpty()) {
            Rprio=ecritureOK;
            RprioEmpty=false;
            Rprio.await();
        }
        R=true;
        mon.unlock();
    }

    public void terminerEcriture() throws InterruptedException {
        mon.lock();
        R=false;
        file.remove().signal();
        mon.unlock();
    }

    public String nomStrategie() {
        return "Stratégie: FIFO";
    }
}
