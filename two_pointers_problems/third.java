class third{
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,2,2,3,3,3,4,4,5,5,55};
        int slow = 0;
        int fast = 0;
        int lastPos = 0;
        int lastNo = -1;
        while(fast < arr.length){
            if(arr[fast] != lastNo){
                lastNo = arr[fast];
                //swap
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
            }
            fast++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}