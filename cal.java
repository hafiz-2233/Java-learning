import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println(addition);
        System.out.println( subtraction);
        System.out.println( multiplication);
        System.out.println(division);

        input.close();
    }
}