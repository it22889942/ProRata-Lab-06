import java.util.Scanner;

public class IT22889942Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        String allNumbers = "";
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            sum += num;                                       // accumulate
            allNumbers += (i == 1) ? ("" + num) : (" " + num); // build display string
            i++;
        }

        double average = (double) sum / 10;   // cast to double for decimal result

        System.out.println("\nThe numbers you entered are:");
        System.out.println(allNumbers);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}