package Practice.basics.力扣;

import java.util.Arrays;

/**
 * @Title: 无重复子串
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/7 20:29
 * @description: 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
 */
public class 无重复子串 {
    public static int lengthOfLongestSubstring(String s) {
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            int a = i + 1;
            char c = s.charAt(i);
            while (a < s.length()) {
                char c1 = s.charAt(a);
                if (c == c1) {
                    sum = a - i;
                    arr[i] = sum;
                    break;
                } else {
                    a++;
                }
            }
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abcbcc");
        System.out.println(i);
    }
}
