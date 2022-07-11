package binary_search;

public class binary_search {
    static  int bin_search(int[] arr,int left,int right,int target){
        if(left>right){ // base case
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return bin_search(arr,left  ,mid,target);
        }else{
            return bin_search(arr,mid+1,right,target);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,6,7,11,45,67};
        System.out.println(bin_search(arr,0,arr.length-1,11));
        int left=0,right = arr.length-1,target = 11;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] <= target){
                System.out.println(mid);
                break;
            }else if(arr[mid] > target){
                right = mid-1;
            }else {
                left = mid + 1;
            }
        }
        System.out.println("found");
    }
}
