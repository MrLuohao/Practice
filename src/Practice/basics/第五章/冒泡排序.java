package Practice.basics.第五章;

import java.util.Arrays;

/**
 * @Title: 冒泡排序
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/16 18:03
 * @description: 冒泡排序
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {12, 33, 55, 77, 1, 5, 23, 19, 88};
        //使用冒泡排序对该数组进行排序
        for (int i = 1; i < arr.length; i++) { //外层循环用于确定排序次数，因为最后一次最后一个元素只有自己本身，所以排序次数一般为数组长度减一
            for (int j = 0; j < arr.length - i; j++) {  //内层循环用于比较排序
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
