package offering;

import storage.BagFactory;
import storage.IBag;
import surprises.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag bag;
    private int waitTime;

    public AbstractGiveSurprises(String type, int waitTime) {
        this.bag = BagFactory.getBag().makeBag(type);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.bag.put(surprises);
    }

    public void give() {
        if (this.bag.isEmpty()) {
            System.out.println("The bag is empty");
            return;
        }
        this.bag.takeOut().enjoy();
        giveWithPassion();
    }

    public void giveAll() {
        this.give();

        while (!this.bag.isEmpty()) {
            try {
                TimeUnit.SECONDS.sleep(this.waitTime);
                this.give();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    protected abstract void giveWithPassion();
}
