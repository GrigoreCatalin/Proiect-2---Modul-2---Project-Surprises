package surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise{
    private final static Random random = new Random();
    private String message;
    private static final ArrayList<String> saying = new ArrayList<String>(Arrays.asList("Nu trebuie sa stii tot drumul pana la destinatie. Fa primul pas si vei sti care este urmatorul -> Martin Luther King.",
            "Puterea nu corupe. Frica o face. Poate frica de a pierde puterea. -> John Steinbeck", "Măsura unui om constă în ce face cu puterea. -> Platon",
            "Tăcerea este ultima armă a puterii. -> Charles de Gaulle", "Pentru cei puternici, fărădelegile sunt comise întotdeauna de alții. -> Noam Chomsky",
            "Obiectivul puterii este puterea. -> George Orwell", "Cunoașterea este putere. -> Francis Bacon", "Pașii puterii sunt adeseori pași pe nisip. -> Edward Counsel",
            "Puterea este cel mai puternic afrodisiac -> Henry Kissinger" + "Cu cât e mai mare puterea, cu atât este mai periculos abuzul. -> Edmund Burke",
            "A stăpâni pe alții este tărie. A te stăpâni pe tine însuți este adevărata putere. -> Tao Te Ching", "Puterea este un cuvânt a cărui semnificație nu o înțelegem. -> Lev Tolstoi",
            "Puterii îi lipsesc morala sau principiile. Nu are decât interese. ->  Horacio Castellanos Moya", "Cea mai mare putere o are cel care are putere asupra lui. -> Seneca",
            "Puterea înseamnă că atunci când ai toate motivele pentru a ucide pe cineva, nu o faci totuși. ->  Paskar Shindler", "Puterea de a face bine este, de asemeni, și cea de a face rău. -> Milton Friedman",
            "Puterea are o singură îndatorire: să asigure bunăstarea oamenilor. ->  Benjamin Disraeli", "Un prieten la putere este un prieten pierdut. ->   Henry Adams",
            "Fiecare adaos la adevărată cunoaștere este un adaos la puterea umană. -> Horace Mann", "Stupiditatea oamenilor invită insolența puterii. -> Ralph Waldo Emerson",
            "Legea limitează întotdeauna orice putere pe care o oferă. -> David Hume"));


    private FortuneCookie(String message){
        this.message = message;
    }

    public static FortuneCookie generateSurprises() {

        int numberForQuote = random.nextInt(FortuneCookie.saying.size());
        String message = saying.get(numberForQuote);

        return new FortuneCookie(message);
    }

    @Override
    public void enjoy() {
        System.out.println(this.message);
    }

    @Override
    public String toString(){
        return "[FortuneCookie] num = " + this.message;
    }


}
