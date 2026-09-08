import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("it is palandrome number");
        } else
            System.out.println("it is not palandrome number");
    }
}