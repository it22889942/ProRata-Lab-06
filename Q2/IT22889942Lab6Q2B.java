import java.util.Scanner;

public class IT22889942Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        String allNumbers = "";
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            if (i == 1) {
                allNumbers = allNumbers + num;
            } else {
                allNumbers = allNumbers + " " + num;
            }
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(allNumbers);

        input.close();
    }
}