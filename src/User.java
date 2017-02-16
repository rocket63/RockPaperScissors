import java.util.Scanner;

/**
 * Created by Rob on 2/10/2017.
 */
public class User extends Player {

    Scanner scan1 = new Scanner(System.in);


    @Override
    public String name() {


        System.out.println("What is your name:");
        String userName = scan1.nextLine();

        return userName;

    }

    @Override
    public String generateRoshambo() {


        System.out.println("Choose rock, paper or scissors:");
        String userPlay = scan1.nextLine();

        while (!userPlay.equalsIgnoreCase("rock") && !userPlay.equalsIgnoreCase("paper") && !userPlay.equalsIgnoreCase("scissors")) {


            System.out.println("Oops! Not a valid choice, try again:");
            userPlay = scan1.nextLine();

        }


        return userPlay;
    }
}
