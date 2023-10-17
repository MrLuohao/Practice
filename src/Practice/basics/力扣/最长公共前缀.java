package Practice.basics.力扣;

/**
 * @Title: 最长公共前缀
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/11 19:14
 * @description: 最长公共前缀：编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class 最长公共前缀 {

    public static String longestCommonPrefix(String[] strs) {
        String MinShortStr = strs[0];
        String str = "";
        int MinLen = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < MinLen) {
                MinLen = strs[i].length();
                MinShortStr = strs[i];
            }
        }

        outer:
        for (int i = 0; i < MinLen; i++) {
            boolean flag = true;
            for (int l = 0; l < strs.length; l++) {
                if (MinShortStr.charAt(i) != strs[l].charAt(i)) {
                    flag = false;
                    break outer;
                }
            }
            if (flag = true) {
                str += MinShortStr.charAt(i);
            }
        }


        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
