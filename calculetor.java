import java.util.Scanner;

public class calculetor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        double num1= sc.nextDouble();
        System.out.println("enter num2");
       double num2= sc.nextDouble();
        System.out.print("Enter Operator (+,-,*,/): ");
        char op = sc.next().charAt(0);
        switch (op){
            case '-':
                System.out.println(num1-num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
            default:
                System.out.println("invalid");
        }
    }
}
