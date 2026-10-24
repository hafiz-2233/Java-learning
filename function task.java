import java.util.Scanner;

public class Main {

    static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        add(num1, num2);
    }
}