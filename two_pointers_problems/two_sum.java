import java.util.*;
/* given sorted array and k .find pair that has sum target k
https://unacademy.com/class/two-pointer-technique/8BOICAFC
*/
class two_sum{
    public static void main(String[] args){
        int[] arr = new int[]{3,5,7,8,9,11,23,30,32};
        int left = 0;
        int right = arr.length-1;
        int sum = 0;
        int k = 28;
        while(left < right){
            sum = arr[left]+arr[right];
            if(sum == k){
                System.out.println("found" + left +" "+ right );
                break;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("completed");
    }
}