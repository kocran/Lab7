package edu.cscc;
import java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * @author Kwame Ocran
     * date: 2/25/20
     * the program simulates a pvc (player v computer) game of rock, paper, scissors, lizard, spock
     * @version 1.0
     * @param args
     */

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;
/**
 * the outer loop controls whether or not there will be another round
 * @return closing statement if n is entered or re-loops if y is entered
 * @param answer - y: to keep playing, n: to stop
 */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            /**
             * @param h_pick - calls methods to validate that the answer is valid
             * @return false if the input is not valid and continues on with program if true
             */
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
            /**
             *calls methods to create computer's pick
             * @return c_pick
             */


            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");
            /**
             * outputting to player whether or not they won or if it was a tie
             */
            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}