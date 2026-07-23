package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {8,6,4,3,1,2};
        System.out.print("Array :");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        for(int i  = 0; i < arr.length -1 ; i++){
            int minIndex = i ;
            for ( int j = i + 1; j < arr.length ; j++ ) {

                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = 0;
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println();
            for (int x  = 0; x <= arr.length - 1; x++ ){
                System.out.print(arr[x]+ " ");
            }
        }
        System.out.println();


        System.out.print("Sorted Array :");

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
