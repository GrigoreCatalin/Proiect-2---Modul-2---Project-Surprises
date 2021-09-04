package surprises;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
    private static final ArrayList<String> nameOfToys = new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
    private String nameOfToy;
    private static int counterForToys;

    private MinionToy(String nameOfToy){
        this.nameOfToy = nameOfToy;
    }

    public static MinionToy generateSurprises() {
        MinionToy toy = new MinionToy(nameOfToys.get(counterForToys));
        counterForToys++;
      if (counterForToys == nameOfToys.size()){
          counterForToys = 0;
      }
        return toy;
    }

    @Override
    public String toString(){
        return "[Minion] num = " + this.nameOfToy;
    }

    @Override
    public void enjoy() {
        System.out.println("Minionul este " + this.nameOfToy + ".");
    }




}
