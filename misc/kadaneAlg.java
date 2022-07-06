package misc;
// used to solve maxiumum sum in contiguous sub array

// if sub array has negative values

// other wise sliding window alogorithm will solve the sub array problems
public class kadaneAlg {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,-3,-3,2};
        int globalMax = 0;
        for(int i=0;i<arr.length;i++){
            int local_max = globalMax+arr[i];
            local_max = Math.max(local_max,arr[i]);
            if(local_max > globalMax){
                globalMax = local_max;
            }
        }
        System.out.println(globalMax);
    }
}