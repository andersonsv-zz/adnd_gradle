package  andersonsv.com.br.jokelib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokeGen {

    private final String jokeOne = "My relationship is like an iPad. I don't have an iPad.";
    private final String jokeTwo = "I am nobody. Nobody is perfect. I am perfect.";
    private final String jokeThree = "I’m not lazy. I’m just naturally a very relaxed person.";
    private final String jokeFour = "He who wakes up early, yawns all day long.";
    private final String jokeFive = "You can only be young once. But you can enjoy being infantile forever.";
    private final String jokeSix = "I weighed myself today. It is clear I am too small for my weight.";
    private final String jokeSeven = "Funny that you can't spell \"slaughter\" without \"laughter\".";
    private final String jokeEight = "Dogs have beloved masters. Cats have waiting staff.";
    private final String jokeNine = "After millions of years of evolution, you’re kind of a disappointment.";
    private final String jokeTen = "I’m breathing. That’s about it for today’s productivity.";

    private final List<String> jokes =  asList(jokeOne, jokeTwo, jokeThree,jokeFour,jokeFive,
            jokeSix, jokeSeven, jokeEight, jokeNine, jokeTen);

    public String getRandomJoke() {
        int random = new Random().nextInt(jokes.size()-1);
        return jokes.get(random);
    }
}
