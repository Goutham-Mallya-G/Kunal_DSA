package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums= {0,2,1,5,3,4};
        int[] ans = new int[nums.length];
        for (int i =0; i< nums.length;i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
