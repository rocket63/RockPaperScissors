public class Main {

    public static void main(String[] args) {


        int player = 0;
        PlayerOne playerOne = new PlayerOne();
        PlayerTwo playerTwo = new PlayerTwo();
        User user = new User();
        Game game = new Game();


        System.out.println("Welcome to Rock, Paper, Scissors!");

        user.name();
        //game.playGame(player);

        do {
            int choice = game.playGame(player);
            if ( choice== 1) {
                game.userVsPlayer1(user.generateRoshambo());
            } else if (choice == 2) {
                game.userVsPlayer2(user.generateRoshambo());
            }



        }while (game.playerContinue() != 'n') ;
    }
}