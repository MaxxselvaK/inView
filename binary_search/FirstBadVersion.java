package binary_search;
// https://leetcode.com/problems/first-bad-version/submissions/
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 0,high = n;
        while(low <= high){
            int mid = low+(high-low)/2;

//            if(isBadVersion(mid)){
//                high = mid-1;
//            }else{
//                low = mid + 1;
//            }
        }
        return low;
    }
}
