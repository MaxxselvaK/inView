package binary_search;

import java.util.Arrays;

//https://www.geeksforgeeks.org/place-k-elements-such-that-minimum-distance-is-maximized/
//https://www.youtube.com/watch?v=wSOfYesTBRk
public class LargestMinDistance {

    static boolean isFeasible(int[] arr, int k_ele,int distance){
        int prev_pos = arr[0];
        int count = 1;
        for(int i = 1; i<arr.length;i++){
            if( arr[i] - prev_pos >= distance){
                count++;
                prev_pos = arr[i];
            }
            if(count == k_ele){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,8,4,9};

        int[] arr = new int[]{1, 2, 7, 5, 11, 12};

        // sort because we need to find k elements so that the distance is maximized
        Arrays.sort(arr);
        int len = arr.length;
        // defining search space for binary search
        int low = arr[0], high =  arr[len-1]-arr[0];
        int k = 3;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(isFeasible(arr,k,mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println("Minimum Distance "+high);

    }
}
