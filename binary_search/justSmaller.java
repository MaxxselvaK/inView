package binary_search;

public class justSmaller {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,4,6,9,33};
        int x = 7;
        // find value in the array that is just less than or equal to the x
        System.out.println("Position of X = " + binarySearch(arr,x));

    }
    static int binarySearch(int[] arr,int x){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] <= x){
                ans = mid + 1;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return  ans;
    }

}
