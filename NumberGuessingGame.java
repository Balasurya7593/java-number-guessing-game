import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int maxNumber;
            
            // Difficulty selection
            System.out.println("Select difficulty level:");
            System.out.println("1 - Easy (1 to 50)");
            System.out.println("2 - Medium (1 to 100)");
            System.out.println("3 - Hard (1 to 200)");
            
            System.out.print("Enter your choice: ");
            int difficulty = scanner.nextInt();
            
            maxNumber = switch (difficulty) {
                case 1 -> 50;
                case 2 -> 100;
                default -> 200;
            };
            
            int number = random.nextInt(maxNumber) + 1;
            int guess = 0;
            int attempts = 0;
            
            System.out.println("\nGuess a number between 1 and " + maxNumber);
            
            while (guess != number) {
                
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if (guess < number) {
                    System.out.println("Too low! Try again.");
                }
                else if (guess > number) {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts taken: " + attempts);
                }
            }
        }
    }
}