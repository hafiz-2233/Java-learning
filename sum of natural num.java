import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =10;
        int sum=0;
        for (int i=1;i<=num;i++)  sum += i;
        System.out.println( sum);
    }
}