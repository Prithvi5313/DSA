package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2,6,4,8,1,5};
        System.out.print("Array :");
        for (int i  = 0; i < arr.length ; i++ ){
            System.out.print(arr[i]+ " ");
        }

        for(int i  = 0; i < arr.length - 1; i++){
            for ( int j = 0; j < arr.length - i - 1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for (int x  = 0; x < arr.length; x++ ){
                System.out.print(arr[x]+ " ");
            }
        }
        System.out.println();


        System.out.print("Sorted Array :");

        for (int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i]+ " ");
        }

    }

}
