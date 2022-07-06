package Greedy;

public class MinProductSubset {
    public static void main(String[] args){
        int[] nums = new int[]{ -1, -2, 4, 3 };

        int no_of_neg = 0,product = 1,no_of_zero=0, min_positve = Integer.MAX_VALUE,min_negative = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                no_of_zero++;
                continue;
            }
            if(nums[i] < 0){
                no_of_neg++;
            }
            if(nums[i] > 0 && nums[i] < min_positve){
                min_positve = nums[i];
            }
            if(nums[i] < 0 && nums[i] > min_negative){
                min_negative = nums[i];
            }
            product = product * nums[i];
        }

        // case 1 if no negative element is there
        if(no_of_neg == 0){
            System.out.println(min_positve);
        }

        // case 2 if odd no of negative element
        if(no_of_neg%2 != 0){
            System.out.println(product);
        }

        // case 3 if even no of negative element, total product except minimum negative element
        if(no_of_neg %2 == 0){
            System.out.println(min_negative);
            System.out.println(product/min_negative); // dividing the same number will remove the producted value
        }

    }
}
