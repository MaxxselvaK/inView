package binary_search;

public class find_starting_pos_target {

    public static int findStart(int[] arr,int target){
        int low = 0, high = arr.length;

        while(low < high) // search space size 2
        {
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
    static int findEnd(int[] arr,int target){
        int left = 0, right = arr.length-1;
        while(left < right){ // search space is 2
            int mid = left + (right+1 - left)/2;
            System.out.println(left + " "+right + " "+mid);
            if(arr[mid] <= target){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,8};
//        System.out.println(findStart(arr,7));
        System.out.println(findEnd(arr,7));
        System.out.println(findEnd(arr,8));
//        System.out.println(findEnd(arr,10));
    }

}
