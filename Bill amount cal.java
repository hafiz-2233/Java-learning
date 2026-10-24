import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the units:   ");
        int units= sc.nextInt();
        double bill;
        if (units<=100){
            bill=units*5;
        } else if (units<=200) {
            bill=(100*5)+(100*8);

        } else if (units<=300) {
            bill=(100*5)+(100*8)+(100*10);
        }else{
            bill = (100 * 5) + (100 * 8) + (100 * 10) + (100*12);

        }
        System.out.println(bill);
    }
}