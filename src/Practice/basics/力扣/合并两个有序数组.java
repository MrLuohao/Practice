package Practice.basics.力扣;

/**
 * @Title: 合并两个有序数组
 * @Author Mr.罗
 * @Package Practice.basics.力扣
 * @Date 2023/10/6 16:44
 * @description: 合并两个有序数组:给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class 合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] ret = new int[m + n];
        for (; i < m && j < n; k++) {
            if (nums1[i] <= nums2[j]) {
                ret[k] = nums1[i++];
            } else {
                ret[k] = nums2[j++];
            }
        }
        while (i < m) {
            ret[k++] = nums1[i++];
        }
        while (j < n) {
            ret[k++] = nums2[j++];
        }
        //最后吧结果放回nums1
        for (i = 0; i < m + n; i++) {
            nums1[i] = ret[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 7, 9,0,0,0,0};
        int[] arr2 = {1, 3, 4, 8};
        merge(arr1, 5, arr2, 4);
        for (int a:arr1
             ) {
            System.out.println(a);
        }
    }
}