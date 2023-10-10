package Practice.basics.力扣;

import java.util.Arrays;

/**
 * @Title: 两数之和
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/7 19:34
 * @description: 两数之和:给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案
 */
public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = i + 1;
            while (a < nums.length) {
                if (nums[i] + nums[a] == target) {
                    arr[0] = i;
                    arr[1] = a;
                    return arr;
                } else {
                    a++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3};
        int[] sum = twoSum(arr, 8);
        System.out.println(Arrays.toString(sum));
    }
}
