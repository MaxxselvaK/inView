package binary_search;
// given sorted array of n+1 integers between 1 to n; it has exactly only one duplicate. find it
// we can solve it in O(N) time. but if we apply binary search we can solve it in O(logn) time.
public class findDupInSortedArray {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[]{1,2,3,3,4,5,6};
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = (left+right)/2;
//            System.out.println(mid);
            if(arr[mid] == arr[mid+1] || arr[mid] == arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }else if(mid < arr[mid]){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }

    }
}
