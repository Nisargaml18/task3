package numberguess;
import java.util.Random;
import java.util.Scanner;
public class Numberguessinggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (!win) {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        System.out.println("You win! The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries.");
        scanner.close();
    }
	}


