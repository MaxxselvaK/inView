package Array.SlidingWindow;

public class KSizeArray {

    static int findMaxSubArraySumOfSizeK(int[] array,int k){
        // applying sliding window
        int window_start=0,window_end=window_start+k;
        int current_sum = 0,maxSum = 0;
        int sub_array_starting_ind = 0;
        for(int i=0;i<array.length;i++){
            current_sum += array[i];

            if(i < k){
                // accumulate until subarray size
                maxSum = current_sum;
            }else{
                // remove the first element to match the sub array size. window increased when we add element to the current sum
                current_sum -= array[i-k];

                if(current_sum> maxSum){
                    maxSum = current_sum;
                    sub_array_starting_ind = i-k+1;
                }
            }
        }
        System.out.println("index "+sub_array_starting_ind);
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,1,3,4,5};
        int k = 3;
        char c1 = 'f';
        char c = (char) (c1 - ('a'-'A'));

        System.out.println("Max subarray of size "+k+" is"+ findMaxSubArraySumOfSizeK(arr,k));

    }
}
