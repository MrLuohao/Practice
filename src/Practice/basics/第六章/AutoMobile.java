package Practice.basics.第六章;

import java.util.Arrays;

/**
 * @Title: 编程训练
 * @Author Mr.罗
 * @Package Practice.basics.第六章
 * @Date 2023/8/19 15:39
 * @description: 第六章编程训练
 */
public class AutoMobile {
    public AutoMobile(int oilVolume, int leftOilVolume) {
        int addOilVolume = oilVolume - leftOilVolume;
        int time = 0;
        System.out.println("即将加满油箱……");
        while (addOilVolume != 0) {
            System.out.println("还剩余" + addOilVolume + "L，已耗时" + time + "秒。");
            addOilVolume -= 2;
            time += 5;
        }
        System.out.println("还剩余" + addOilVolume + "L，已耗时" + time + "秒。");
    }

    static String FzArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            if (i == 0) {
                temp = arr[i];
                arr[i] = arr[2];
                arr[2] = temp;
            }
            if (i == 1) {
                temp = arr[i];
                arr[i] = arr[3];
                arr[3] = temp;
                break;
            }
        }
        return "数组元素交换成功";
    }

    public static void main(String[] args) {
        AutoMobile am = new AutoMobile(30, 6);
        /*float c = (float)2/(float)5;
        System.out.println(c);*/
        int arr[] = {1, 3, 5, 7};
        String s = AutoMobile.FzArray(arr);
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
    }
}