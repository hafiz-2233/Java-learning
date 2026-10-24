import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // User se number lena
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        // Even ya Odd check karna
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number.");
        } else {
            System.out.println(number + " is an Odd Number.");
        }

        // Scanner close
        input.close();
    }
}