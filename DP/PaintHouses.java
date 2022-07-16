package DP;

import java.util.Arrays;
import java.util.Comparator;

//https://www.lintcode.com/problem/515/
public class PaintHouses {
    public static int minCost(int[][] costs) {
        // write your code herei

        int houses = costs.length;
        int colors = costs[0].length;

        int[][] cache = new int[houses][colors];

        // here only 3 colors available

        Arrays.sort(cache, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });
        for(int i=0;i<houses;i++){
            for(int j=0;j<colors;j++){
                if(i == 0){
                    cache[i][j] = costs[i][j];
                    continue;
                }
                if(j == 0){
                    cache[i][j] = costs[i][j] + Math.min(costs[i-1][j+1],costs[i-1][j+2]);
                }else if( j == 1){
                    cache[i][j] = costs[i][j] + Math.min(cache[i-1][j+1],cache[i-1][j-1]);
                }else if( j == 2){
                    cache[i][j] = costs[i][j] + Math.min(cache[i-1][j-1],cache[i-1][j-2]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int[] mat : cache){
            System.out.println(Arrays.toString(mat));
        }
        for(int j=0;j<colors;j++){
            if( min > cache[houses-1][j]){
                min = cache[houses-1][j];
            }
        }
        return min;
    }
    public static void main(String[] args) {
//        int[][] costs = new int[][]{{14,2,11},{11,14,5},{14,3,10}};
        int[][] costs = new int[][]{
                {3,5,3},
                {6,17,6},
                {7,13,18},
                {9,10,18}};
        System.out.println(minCost(costs));
    }
}
