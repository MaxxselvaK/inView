package DivideAndConquer;

import java.util.Arrays;

public class FindMinMax {
    static int[] findMinMax(int[] arr,int i,int j){
        if(i == j){ // 1 elements case
            return new int[]{arr[i],arr[j]};
        }else if(i == j-1){ // 2 elements case
            if(arr[i] < arr[j]){
                return new int[]{arr[i],arr[j]};
            }
            return new int[]{arr[j],arr[i]};
        }
        else{
            int mid = (i + j )/2;
            int[] minMax = findMinMax(arr,i,mid);
            int[] minMax2 = findMinMax(arr,mid,j);
            int min = 0;
            int max = 0;
            if(minMax[0] < minMax2[0]){
                min = minMax[0];
            }else {
                min = minMax2[0];
            }
            if(minMax[1] > minMax2[1]){
                max = minMax[1];
            }else{
                max = minMax2[1];
            }
            return new int[]{min,max};
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,3,1,9,7,53,3,22,22};
        System.out.println(Arrays.toString(findMinMax(arr,0, arr.length-1)));
    }
}
