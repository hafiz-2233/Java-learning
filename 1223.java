import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner object banaya
        Scanner input = new Scanner(System.in);

        // User se pehla number lena
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();

        // User se doosra number lena
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        // Sum calculate karna
        int sum = num1 + num2;

        // Result print karna
        System.out.println("Sum = " + sum);

        // Scanner close karna
        input.close();
    }
}