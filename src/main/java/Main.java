import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int target = (int)Math.floor(Math.random() * 5 + 1);
        Integer guess = 0;
        Integer previous = 0;
        int guessCounter = 1;
        Scanner reader = new Scanner(System.in);
        //System.out.println("target is " + target);
        //uncomment this println to give you the answer ahead of time. invaluable for testing!
        while (!(guess.equals(target))){
            System.out.println("Guess a number between 1 and 5: ");
            guess = reader.nextInt();
            if (guess.equals(previous)){
                System.out.println("You just guessed that!");
                //we're only checking for the previous guess, not all previous guesses, so we dont need a dictionary
            } else if (guess > target){
                guessCounter += 1;
                previous = guess;
                System.out.println("Too large! Guess again.");
                //iterate guess counter, change previous to our new guess, go back to our loop
            } else if (guess < target){
                guessCounter += 1;
                previous = guess;
                System.out.println("Too small! Guess again.");
                //iterate guess counter, change previous to our new guess, go back to our loop
            }
        }
        System.out.println("You win! It only took you " + guessCounter + " guesses!");
        /** guesses must start at 1, otherwise we'll be one off. if we started at zero, since we dont iterate on our last process
         * we would show getting the answer in zero guesses.
         * i could have also done guessCounter += 1 before printing our answer, or concatenated (guesscounter + 1)
         */ 
    }
}
