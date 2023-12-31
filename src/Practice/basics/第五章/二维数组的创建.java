package Practice.basics.第五章;

/**
 * @Title: 二维数组的创建
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/14 19:15
 * @description: 二维数组的创建
 */
public class 二维数组的创建 {
    public static void main(String[] args) {
        //二维数组的创建方式一（先声明,再使用new关键字进行内存分配）
        int arr[][];
        arr = new int[2][3];//表示创建了包含两个长度为3的一维数组的二维数组
        //方式二(分别为每个一维数组分配内存)
        int arr1[][];//声明一个二维数组，标识符为arr1
        arr1 = new int[2][];//为二维数组在内存中开辟空间（声明该二维数组里包含两个一维数组，每个一维数组的长度未知）
        arr[0] = new int[3];//为二维数组中下标为0的第一个数组元素开辟内存空间，并声明该二维数组的第一个一维数组长度为3
        arr[1] = new int[2];//为二维数组中下标为1的第二个数组元素开辟内存空间，并声明该二维数组中第二个一维数组长度为2
        //方式三（创建的同时就开辟内存）
        int[][] arr2 = new int[2][3];//创建标识符为arr2的二维数组,并未其开辟内存空间（包含两个长度为3的一维数组）
        System.out.println("———————————————— 二维数组的初始化 ————————————————");
        //二维数组的初始化与一维数组相似
        int[][] arr3 = new int[][]{{11, 22}, {33, 44, 55}};//表示创建一个类型为int类型，标识符为arr3的二维数组，且为其开辟内存空间（包含两个一维数组，第一个一维数组的长度为2且其中的元素为11，22。第二个一维数组的长度为3，且元素为33，44，55）
        String[][] arr4 = {{"我", "爱", "学"}, {"习", "天", "天", "向", "上"}};//表示创建一个类型为String类型，标识符为arr4的二维数组，且未其开辟内存空间（第一个一维数组长度为3且元素为我，爱，学。第二个一维数组长度为5，且元素为习，天，天，向，上）
        //获取二维数组中的第一个一维数组的第一个元素
        String s = arr4[0][0];
        System.out.println("二维数组arr4中第一个一维数组的第一个元素为:" + s);
        //获取二维数组中第二个一维数组中第4个元素
        String s1 = arr4[1][3];
        System.out.println("二维数组arr4中第二个一维数组的第四个元素为:" + s1);
        System.out.println("———————————————— 二维数组的遍历 ————————————————");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                    System.out.println(arr4[i][j]);
            }
        }
    }
}
