import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr={10,20,30,40,50,60,70,80};
        int target=40;
        int left=0;
        int right= arr.length-1;
        boolean found=false;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}