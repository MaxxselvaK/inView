package binary_search;

public class find_start_end_ind {
    static int get_start_ind_bs(int[] arr,int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == x){
                ans = mid;
                high = mid-1;
                continue;
            }
            if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int find_last_ind_bs(int[] arr,int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == x){
                ans = mid;
                low = mid+1;
                continue;
            }
            if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int x = 4;
        int[] arr = {1,2,2,3,4,4,4,5,5,5,5,5,5,5};
        int start = get_start_ind_bs(arr,x);
        int end = find_last_ind_bs(arr,x);
        System.out.println(start+" "+end);
        if(start == -1){
            System.out.println("Not found");
        }
        System.out.println("No of occurrence of "+x+" is "+(end-start+1));
    }
}
