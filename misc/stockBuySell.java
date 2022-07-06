package misc;

public class stockBuySell {
    public static void main(String[] args) {
//        System.out.println(diffHours>=6);
        int[] arr = new int[]{7,1,5,3,6,4};
        int buy = arr[0];
        int profit = 0;
        for(int i = 1; i<arr.length;i++){
            if(buy <= arr[i]){
                buy = arr[i];
            }else{
                if(arr[i] - buy > profit){
                    profit = arr[i] - buy;
                }
            }
        }
        System.out.println(profit);
    }
}
