package storage;

import surprises.ISurprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {
    private final ArrayList<ISurprise> surprises;
    private static final Random random = new Random();


    public RandomBag() {
        this.surprises = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()){
            surprises.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        if (this.surprises != null){
            int randomNumber = random.nextInt(this.surprises.size());
            return this.surprises.remove(randomNumber);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return this.surprises.size();
    }
}
