package DivideAndConquer;

public class QuickSort {
    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int[] arr,int pivot){
        if(pivot < 0 || pivot >= arr.length){
            return;
        }


    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,67,2,1,4,6,7};
        int pivotInd = arr.length / 2;

    }
}
