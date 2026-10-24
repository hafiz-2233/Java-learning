import java.util.Scanner;
<<<<<<< HEAD

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

=======
public class calculater {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        double num1=20;
        double num2=5;
        double add =num1+num2;
        double sub =num1-num2;
        double multiply =num1*num2;
        double divide =num1/num2;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(divide);
    }
>>>>>>> 1a068ba07d9b13418da4b9438c2cd67aa0924bd3
}