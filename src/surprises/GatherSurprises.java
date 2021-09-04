package surprises;

import java.util.Random;

public final class GatherSurprises {
    private static final Random random = new Random();

    private GatherSurprises() {

    }

    public static ISurprise[] gather(int n) {
        ISurprise[] surprises = new ISurprise[n];
        int i = 0;

        while(i < n){
            surprises[i] = gather();
            i++;
        }
        return surprises;
    }

    public static ISurprise gather() {
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return FortuneCookie.generateSurprises();
            case 1:
                return MinionToy.generateSurprises();
            case 2:
                return Candies.generateSurprises();
        }
        return null;
    }


}
