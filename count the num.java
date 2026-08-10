import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int num = 1234546;
     int count=0;
     while (num != 0){
         num=num/10;
         count++;
     }
        System.out.println(count);
    }
}