package Practice.basics.第五章;

/**
 * @Title: 数组的创建
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/14 16:50
 * @description: 数组的创建
 */
public class 数组的创建 {
    public static void main(String[] args) {
        //数组的创建
        //方式一
        int[] Arr;
        Arr = new int[2];
        //方式二 String类型的数组默认为空，int类型的数组默认为0
        String[] arr = new String[2];
        arr[1] = "我爱学习";
        System.out.println(arr[1]);
        int[] arr1 = new int[2];
        System.out.println(arr1[0]);
        //方式三
        int[] arr2 = {1, 2, 3};
        System.out.println(arr2[1]);

        //初始化数组的方式第一种
        int[] sz1 = new int[]{1, 2};
        //初始化数组的方式第二种
        int[] sz2 = {1, 2};
    }
}
