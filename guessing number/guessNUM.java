import java.util.Random;
import java.util.Scanner;

public class guessNUM {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your number between 1 to 10: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println(
                    "You've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
