import java.util.Scanner;

public class IT22889942Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        int sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num == -99) {
                break;                          // sentinel: stop
            }

            if (num < 0) {                      // validation: reject negatives
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;                       // ask again
            }

            sumOfSquares += num * num;          // accumulate X²
            count++;
        }

        if (count == 0) {
            System.out.println("No valid numbers entered.");
        } else {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }

        input.close();
    }
}