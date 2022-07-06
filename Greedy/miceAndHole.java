package Greedy;

import java.util.Arrays;
//https://www.geeksforgeeks.org/assign-mice-holes/
public class miceAndHole {
    public static void main(String[] args) {
        int[] mice = new int[]{-10, -79, -79, 67, 93, -85, -28, -94 };
        int[] hole = new int[]{ -2, 9, 69, 25, -31, 23, 50, 78 };

        // sort to assign minimum distance to the mice

        Arrays.sort(mice);
        Arrays.sort(hole);

        // we need what is the time taken by a last mice after greedily assigning holes

        int max = 0;
        for(int i=0;i<mice.length;i++){
            int dis = Math.abs(mice[i]-hole[i]);
            max = max>dis?max:dis;
        }
        System.out.println(max);
    }
}
