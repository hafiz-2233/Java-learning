import java.util.Scanner;

public class calculater {

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter num 1");
            double num1= sc.nextDouble();
            System.out.println("enter num 2");
            double num2= sc.nextDouble();
            System.out.println("operators(+,-,*,/)");
            char op =sc.next().charAt(0);
            if (op=='+'){
                System.out.println(num1+num2);
                
            } else if (op=='-') {
                System.out.println(num1-num2);

            } else if (op=='*') {
                System.out.println(num1*num2);

            } else if (op=='/') {
                System.out.println(num1/num2);

            }else
                System.out.println("invalid");

        }

}