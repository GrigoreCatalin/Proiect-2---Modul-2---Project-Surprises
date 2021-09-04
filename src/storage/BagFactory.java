package storage;

public class BagFactory implements IBagFactory{
    private static final BagFactory bag = new BagFactory();

    public static BagFactory getBag(){
        return bag;
    }

    @Override
    public IBag makeBag(String type) {
        switch (type){
            case "RANDOM":
                return new RandomBag();
            case "LIFO":
                return new LifoBag();
            case "FIFO":
                return new FifoBag();
        }
        return null;
    }
}
