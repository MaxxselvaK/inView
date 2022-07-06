package binary_search;

public class next_greater_element_in_sorted_array {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,6,8,10,12};
        int left=0,right = arr.length-1,target = 10;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] <= target && arr[mid+1] > target){
                System.out.println(arr[mid+1]);
                break;
            }else if(arr[mid] > target){
                right = mid-1;
            }else {
                left = mid + 1;
            }
        }
    }
}
