package surprises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Candies implements ISurprise {
    private int numberOfCandies;
    private static final ArrayList<String> nameOfCandies = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
    private String candies;
    private static Random random = new Random();

    private Candies(int numberOfCandies, String typeOfCandies) {
        this.numberOfCandies = numberOfCandies;
        this.candies = typeOfCandies;
    }

    public static Candies generateSurprises() {
        int numberOfCandies = (random.nextInt(20 ) + 1); // maxim 20 bomboane
        int numberForNameOfCandies = random.nextInt(Candies.nameOfCandies.size());

        return new Candies(numberOfCandies, nameOfCandies.get(numberForNameOfCandies));
    }

    @Override
    public String toString(){
        return "[Candies] num = " + "Tipul bomboanei: " + this.candies + " si numarul bomboanelor: " + this.numberOfCandies;
    }


    @Override
    public void enjoy() {
        System.out.println("Numarul de bomboane este " + this.numberOfCandies + ", iar tipul acestora este " + this.candies + ".");
    }
}