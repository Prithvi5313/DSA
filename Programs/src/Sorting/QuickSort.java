package Sorting;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {

        if(low<high){
            int pi = partition(arr,low,high);

            quickSort(arr,pi+1,high);
            quickSort(arr,low,pi-1);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j =low; j<high; j++ ){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] =temp;
        return i+1;

    }

    public static void main(String[] args) {

        int[] arr = {8,6,4,3,1,2};
        System.out.print("Array :");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        quickSort(arr,0,arr.length-1);


        System.out.print("Sorted Array :");

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }


}
