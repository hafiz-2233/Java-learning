import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] temp = {
                {32, 34, 33},
                {28, 29},
                {35, 36, 34, 37}
        };

        for (int i = 0; i < temp.length; i++) {
            System.out.print("City " + (i + 1) + ": ");
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}