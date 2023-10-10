package Practice.basics.第五章;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Title: 数组中元素的替换
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/16 14:43
 * @description: 数组中元素的替换
 */
public class 数组中元素的替换 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        int[][] arr1 = {{1, 2}, {3, 4}};
        //使用Arrays类中的fill()静态方法进行替代数组中原有的元素
        Arrays.fill(arr, 3);  //底层其实就是遍历该数组，然后将参数元素逐一替换
        for (int a : arr) {
            System.out.print(a);  //由打印结果可知，arr中的所有元素已经变为3
        }
       /* Arrays.fill(arr1, 2);
        for (int[] a : arr1) {
            for (int c : a) {
                System.out.println(c);  //二维数组是不可以使用该方法的，会报错
            }
        }*/


        System.out.println("\n_____________________");


        //使用Arrays中的fill方法还可以将指定数组的指定范围的值使用参数元素替换（包括下标起始元素，不包括下标结尾元素）
        Arrays.fill(arr, 1, 3, 6);  //该方法表示将数组arr中下标1~3的所有元素值改为6
        for (int a : arr) {
            System.out.print(a);  //由打印结果可知，arr中下标（包括）1~3（不包括）已经变为6
        }

        System.out.println("\n_____________________");

        //使用Arrays中的sort方法可以对数组进行排序（任意类型的数组）
        String[] arr2 = {"我", "爱", "爱","学", "习", "java", "和", "Python"};
        for (String a : arr2) {
            System.out.print(a);
        }
        System.out.println();
        Arrays.sort(arr2);
        for (String a : arr2) {
            System.out.print(a);
        }    //由结果可知，排序前后数组arr2的元素顺序发生了变化，String类型的元素排序顺序是按照ASCII码表进行排序的

        System.out.println("\n_____________________");
        //使用Arrays类中的copyOf和copyOfRange方法可以实现数组元素的复制
        String[] copyOf = Arrays.copyOf(arr2, 2);  //第一个参数为被复制的数组名，第二个参数为复制过后创建的数组长度，如果新数组长度小于被复制数组的长度，则复制满为止
        String[] copyOf2 = Arrays.copyOf(arr2, 10);//如果新数组长度大于被复制数组的长度，空值根据不同类型使用默认值进行填充
        for (String s : copyOf
        ) {
            System.out.print(s);
        }
        System.out.println();
        for (String s : copyOf2) {
            System.out.print(s);
        }
        System.out.println();
        String[] copyOfRange = Arrays.copyOfRange(arr2, 1, 5);//指定范围进行复制[)，包含起始下标，不包含末尾下标，可以超过被复制数组的长度，使用默认值填充
        for (String s : copyOfRange) {
            System.out.print(s);
        }
        System.out.println("\n_____________________");
        //使用Arrays类中的binarySearch()方法可以查询指定数组中指定元素的下标索引，如果存在就返回该下标，不存在就返回"-"（插入点），在使用该方法之前必须先对数组进行排序，使用sort方法
        int i = Arrays.binarySearch(arr2, "爱");
        System.out.println("数组arr2中爱元素对应的下标为:" + i);
        int ii = Arrays.binarySearch(arr2, "a");
        System.out.println("数组arr2中嗯元素对应的下标为:" + ii);
    }
}
