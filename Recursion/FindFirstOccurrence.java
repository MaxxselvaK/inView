package Recursion;

public class FindFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{    2,
                3,
                4,
                1,
                7,
                8,
                7,
                3};
        int ele = 7;
        System.out.println(findFirst(arr,ele,0));
    }

    private static int findFirst(int[] arr, int ele,int pos) {
        if( pos >= arr.length){
            return -1;
        }
        if(arr[pos] == ele){
            return pos;
        }else{
            return findFirst(arr,ele,pos+1);
        }
    }
}
