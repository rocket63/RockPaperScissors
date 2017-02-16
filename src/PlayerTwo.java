import java.util.Random;

/**
 * Created by Rob on 2/10/2017.
 */
public class PlayerTwo extends Player {
    @Override
    public String name() {
        String player2Name = "Sylvester";
        return player2Name;
    }

    @Override
    public String generateRoshambo() {
        Random rand = new Random();

        int randomNum = rand.nextInt(3) + 1;

        String player2 = null;
        switch (randomNum) {

            case 1:
                player2 = "Rock";
                break;

            case 2:
                player2 = "Paper";
                break;

            case 3:
                player2 = "Scissors";
                break;
        }
        return player2;
    }
}
