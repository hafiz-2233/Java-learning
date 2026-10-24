public class Main{
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 20, 30, 40};
        int target = 20;

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("Last occurrence index: " + answer);
    }
}