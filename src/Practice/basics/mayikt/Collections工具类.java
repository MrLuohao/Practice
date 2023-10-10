package Practice.basics.mayikt;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Title: Collections工具类
 * @Author Mr.罗
 * @Package Practice.basics.mayikt
 * @Date 2023/10/7 17:15
 * @description: Collections工具类常用API
 */
public class Collections工具类 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(11);
        integers.add(22);
        integers.add(56);
        Collections.sort(integers);//将参数集合作升序排序
        //Collections只能对单列集合操作工具类操作是可以的，对双列不行
        for (Integer i : integers) {
            System.out.println(i);
        }
        System.out.println("----------------------");
        Collections.reverse(integers);//将参数集合作降序排序
        for (Integer i:integers) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        Collections.shuffle(integers);//使用默认的随机源随机排列出指定的单列集合
        for (Integer i:integers) {
            System.out.println(i);
        }
    }
}
