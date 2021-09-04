package surprises;
import offering.GiveSurpriseAndApplause;
import offering.GiveSurpriseAndHug;
import storage.BagFactory;
import storage.IBag;

public class Main {

    public static void minionToy() {
        GiveSurpriseAndApplause bag1 = new GiveSurpriseAndApplause("FIFO", 2);
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.put(MinionToy.generateSurprises());
        bag1.giveAll();
    }

    public static void createBagsAndTakeOut() {
        IBag bag1 = BagFactory.getBag().makeBag("LIFO");
        bag1.put(FortuneCookie.generateSurprises());
        bag1.put(MinionToy.generateSurprises());

        IBag bag2 = BagFactory.getBag().makeBag("FIFO");
        bag2.put(MinionToy.generateSurprises());
        bag2.put(Candies.generateSurprises());
        bag1.put(bag2);


        while (bag1.size() != 0) {
            System.out.println(bag1.takeOut());
        }
    }

    public static void createSurprisesAndGive(){
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println();

        GiveSurpriseAndHug bag1 = new GiveSurpriseAndHug("FIFO",2);
        bag1.put(s1);
        bag1.put(s2);
        bag1.put(s3);
        bag1.put(s4);
        bag1.giveAll();
    }

    public static void main(String[] args) {
        //minionToy();
        //createBagsAndTakeOut();
        createSurprisesAndGive();






    }
}
