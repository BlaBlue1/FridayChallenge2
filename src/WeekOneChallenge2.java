
import java.util.Random;
import java.util.Scanner;

public class WeekOneChallenge2 {
    public static void main(String [] args) {

/*
 roll1 = randomNumber (1-6)
 roll2 = randomNumber (1-6)

 show the diceRolls
 score = 0

 show the score
 response = userInput

 prompt user to continue playing or stop

IF roll1 = 1 OR roll2 = 1
score = score

IF( roll1 NOT 1 AND roll2 NOT 1)
 score = score + (roll1 + roll2)

IF( roll1 =1 AND roll2=1)
 score = score + 25

IF (playAgain = no)
 game ends

IF (score >100)
 game ends and the player wins
EndIF
 Thank you for playing!
End

 */
    Scanner keyboard = new Scanner(System.in);
        int roll1 = 0;
        int roll2 = 0;
        int score = 0;
        String answer = "";
        do {
            //We generate random number
            roll1 = (int) (Math.random() * 6 - 1) + 1;
            //int r = (int) (Math.random() * (upper - lower)) + lower;
            roll2 = (int) (Math.random() * 6 - 1) + 1;
            //To show random rolls
            System.out.println("Your rolls " + roll1 + "&" + roll2 );
            if(roll1 == 1 || roll2 == 1) {
                score += 0; // (score += ) means score = score
                // if we don't initialize the int it will
                // error out so we have to initialize it to zero int score =0
            } if(roll1 != 1 && roll2 !=1) {
                score += (roll1 + roll2);
            } if(roll1 ==1 && roll2 == 1) {
                score += 25;
            }
            System.out.println("Your score is " + score);
            //we ask the user if he/she wants to play further
            System.out.println("Roll again?");
            answer = keyboard.nextLine();
        }while(answer.equalsIgnoreCase("yes") && score < 100);
         if(score >= 100) {
            System.out.println("You have scored over 100");
        }
         System.out.println("Thank you for playing!");



        //receive user input or prompt the user to continue or not


    }
}
