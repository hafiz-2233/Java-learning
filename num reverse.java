import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num :");
        int num = sc.nextInt();
        int reversed = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}