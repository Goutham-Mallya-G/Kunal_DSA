package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,1};
        int[] ans = new int[2*nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        for(int i = nums.length; i < 2*nums.length;i++){
            ans[i] = nums[i - nums.length];
        }
        System.out.println(Arrays.toString(ans));
    }
}
