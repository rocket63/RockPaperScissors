import java.util.Scanner;

/**
 * Created by Rob on 2/10/2017.
 */
public class Game {

    Scanner scan1 = new Scanner(System.in);

    public int playGame(int player) {




        System.out.println("Would you like to play Rocky or the Rock:");
        String opponent = scan1.nextLine();

        if (opponent.equalsIgnoreCase("rock")) {
            System.out.println("You have chosen to play Dwayne.");
            player = 1;
        } else if (opponent.equalsIgnoreCase("rocky")){
            System.out.println("You have chosen to play Sylvester!");
            player = 2;
        }

        return player;
    }

    public static String userVsPlayer1(String user) {

        String player1 = "Rock";

        System.out.println("Your choice: " + user);
        System.out.println("Dwayne's choice: " + player1);


        if (user.equalsIgnoreCase(player1)) {
            System.out.println("Draw!");
        } else if (user.equalsIgnoreCase("Paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Dwayne wins.");
        }


        return null;
    }

        public static String userVsPlayer2(String user) {

            PlayerTwo playerTwo = new PlayerTwo();

            String player2 = playerTwo.generateRoshambo();

            System.out.println("Your choice: " + user);
            System.out.println("Sylvester's choice: " + player2);

            if (user.equalsIgnoreCase(player2)) {
                System.out.println("Draw!");
            }
            if (user.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("paper")) {
                System.out.println("You lose!");
            }
            else if (user.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) {
                System.out.println("You win!");
            }
            if (user.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
            }
            else if (user.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
            }
            if (user.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            }
            else if (user.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("rock")) {
                System.out.println("You lose!");


            }

            return null;



    }

    public  char playerContinue() {

        System.out.println("Would you like to play again: (y/n)");
        char userCont = scan1.nextLine().charAt(0);

        return userCont;
    }



    }





