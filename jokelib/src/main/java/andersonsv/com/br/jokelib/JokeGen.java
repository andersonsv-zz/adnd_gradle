package  andersonsv.com.br.jokelib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokeGen {

    String jokeOne = "My relationship is like an iPad. I don't have an iPad.";
    String jokeTwo = "I am nobody. Nobody is perfect. I am perfect.";
    String jokeThree = "I’m not lazy. I’m just naturally a very relaxed person.";
    String jokeFour = "He who wakes up early, yawns all day long.";
    String jokeFive = "You can only be young once. But you can enjoy being infantile forever.";
    String jokeSix = "I weighed myself today. It is clear I am too small for my weight.";
    String jokeSeven = "Funny that you can't spell \"slaughter\" without \"laughter\".";
    String jokeEight = "Dogs have beloved masters. Cats have waiting staff.";
    String jokeNine = "After millions of years of evolution, you’re kind of a disappointment.";
    String jokeTen = "I’m breathing. That’s about it for today’s productivity.";

    List<String> jokes =  asList(jokeOne, jokeTwo, jokeThree,jokeFour,jokeFive,
            jokeSix, jokeSeven, jokeEight, jokeNine, jokeTen);

    public String getRandomJoke() {
        int random = new Random().nextInt(jokes.size()-1);
        return jokes.get(random);
    }
}
