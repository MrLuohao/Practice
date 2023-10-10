package Practice.basics.力扣;

/**
 * @Title: 回文数
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/10 0:32
 * @description: 判断一个整数是否为回文数
 */
public class 回文数 {
    public static boolean isPalindrome(int x) {
        String s = x + "";
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = isPalindrome(123321);
        System.out.println(b);
    }
}
