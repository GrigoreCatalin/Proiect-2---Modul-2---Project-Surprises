package storage;
import surprises.ISurprise;
import java.util.ArrayList;

public class LifoBag implements IBag{
    private final ArrayList<ISurprise> surprises;

    public LifoBag(){
        this.surprises = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
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
            return this.surprises.remove(this.surprises.size() - 1);
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
