import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:  ");
        int num= sc.nextInt();
        long first = 0, second = 1;
           for (int i=0;i<=num;i++){

               long next = first + second;
               first=second;
               second=next;
               System.out.println(first+"");
           }

    }
}