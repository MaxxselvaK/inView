package Recursion;

public class FindNoOfOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,5,5,4,2,1,2};
        int target = 2;
        System.out.println(noOfOccurrence(arr,target,0));
    }
    static public int noOfOccurrence(int[] arr,int target,int pos){
        if(pos == arr.length){
            return 0;
        }
       return (arr[pos] == target ? 1 : 0 ) + noOfOccurrence(arr,target,pos+1);
    }
}
