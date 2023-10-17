package Practice.basics.力扣;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Title: 有效的括号
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/11 23:48
 * @description: 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 */
public class 有效的括号 {
     /*   public boolean isValid(String s) {
            Stack<Character>stack = new Stack<Character>();
            for(char c: s.toCharArray()){
                if(c=='(')stack.push(')');
                else if(c=='[')stack.push(']');
                else if(c=='{')stack.push('}');
                else if(stack.isEmpty()||c!=stack.pop())return false;
            }
            return stack.isEmpty();
        }*/

        public boolean isValid(String s) {
            int length = s.length() / 2;
            for (int i = 0; i < length; i++) {
                s = s.replace("()", "").replace("{}", "").replace("[]", "");
            }

            return s.length() == 0;
        }


    public static void main(String[] args) {

    }
}
