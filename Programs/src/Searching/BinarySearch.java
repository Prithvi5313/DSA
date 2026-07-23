package Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 3;
        int first = 0;
        int last = arr.length -1;


        System.out.println(binarySearch(arr, n));
        System.out.println(recursiveBinarySearch(arr,n,first,last));
    }


    public static int binarySearch(int[] arr, int n) {
        int step = 0 ;
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {

            int mid = (first + last) / 2;
            step++;
            if (arr[mid] == n) {

                System.out.println("steps taken "+step);
                return mid;
            } else if (n > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
    public static int recursiveBinarySearch(int[] arr, int n, int first, int last) {
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (n > arr[mid]) {
                return recursiveBinarySearch(arr,n,mid+1,last);
            } else {
                return recursiveBinarySearch(arr,n,first,mid-1);
            }
        }
        return -1;
    }
}
