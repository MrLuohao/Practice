package Practice.basics.mayikt;

import java.util.HashSet;
import java.util.Random;

/**
 * @Title: 生成随机数
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/7 18:45
 * @description: 生成10个1~20不重复的随机数并将其存放于集合中
 */
public class 生成随机数 {
    //HashSet集合的元素是不允许重复的
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();//创建HashSet集合用于存放生成的随机数
        Random random = new Random();//创建生成随机数的对象
        while (numbers.size() < 10) {
            int number = random.nextInt(20) + 1;//生成1~20的随机数
            numbers.add(number);
        }
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
