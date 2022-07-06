package interview_problems;

public class makeArrayIncreasingOrder {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,1,15};
        arr[0]=0;

        for(int i=1;i<arr.length;i++){
            int x = arr[i];
            if(arr[i] - x > arr[i-1]){
                arr[i] = arr[i] - (x-i);
                continue;
            }else{
                System.out.println("break");
                break;
            }
        }
    }
}
