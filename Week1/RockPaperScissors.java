import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[] moves = {"Rock", "Paper", "Scissors"};

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = sc.nextLine();

            String computer = moves[r.nextInt(3)];

            System.out.println("Computer: " + computer);

            if (player.equalsIgnoreCase(computer)) {
                System.out.println("Draw");
                draws++;
            }
            else if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                     (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                     (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
                System.out.println("Player Wins");
                wins++;
            }
            else {
                System.out.println("Computer Wins");
                losses++;
            }
        }

        double winPercent = (wins * 100.0) / 5;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercent);

        sc.close();
    }
}
