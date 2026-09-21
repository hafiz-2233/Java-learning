import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25, 30, 35};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Number found at index: " + mid);
                return;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Number not found");
    }
}