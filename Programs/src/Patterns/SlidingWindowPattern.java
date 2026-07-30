package Patterns;


//Question = Find the maximum sum of any subarray of size k.

public class SlidingWindowPattern {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;

        // First window
        windowSum = getWindowSum(arr, k, windowSum);

        int max = windowSum;

        // Slide the window
        for(int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i-k];

            max = Math.max(max, windowSum);
        }

        return max;
    }

    private static int getWindowSum(int[] arr, int k, int windowSum) {
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        return windowSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        System.out.println(maxSum(arr,3));
    }
}
