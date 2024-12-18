package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4};
        for ( int i = 0 ; i<nums.length ; i++){
            if(i>0) {
                nums[i] = nums[i - 1] + nums[i];
            }
//            }else {
//                nums[i]=nums[i];
//            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
