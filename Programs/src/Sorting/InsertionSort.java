package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {8,6,4,3,1,2};
        System.out.print("Array :");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        for(int i = 1; i<arr.length; i++){
            int key = arr[i] ;
            int j = i-1;
            while(j >= 0 && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
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
