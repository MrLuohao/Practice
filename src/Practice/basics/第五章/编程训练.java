package Practice.basics.第五章;

import java.util.Arrays;

/**
 * @Title: 编程训练一
 * @Author Mr.罗
 * @Package Practice.basics.第五章
 * @Date 2023/8/14 17:38
 * @description: 编程训练一
 */
public class 编程训练 {
    public static void main(String[] args) {
        System.out.println("———————————————— 编程训练一 ————————————————");
        //编程训练第一题
        char[] arr1 = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
        char[] arr2 = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
        char[] arr3 = {'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        char[][] arrXX = new char[3][];
        arrXX[0] = arr1;
        arrXX[1] = arr2;
        arrXX[2] = arr3;
        for (int i = 0; i < arrXX.length; i++) {
            System.out.println("第" + (i + 1) + "排元素个数有" + arrXX[i].length + "个");
        }
        /*char[][] arrX = new char[2][2];
        arrX[0][0] = 'a';
        System.out.println(arrX[0][0]);*/
        System.out.println("键盘第一排的字母个数为:" + arr1.length + "个\n键盘第二排字母个数为:" + arr2.length + "个\n键盘第三排字母个数为:" + arr3.length + "个");
        System.out.println("\n———————————————— 编程训练二 ————————————————");
        //编程训练第二题
        int[] arr4 = {1, 4, 6, 7, 9, 10, 11, 14, 15, 17, 18};//已经使用的储物箱编号
        int[] arr5 = new int[]{2, 3, 5, 8, 12, 13, 16, 19, 20};//未使用的储物箱编号
        System.out.println("已使用的储物箱个数为:" + arr4.length + "个\n未使用的储物箱个数为:" + arr5.length + "个");
        System.out.println("\n———————————————— 编程训练三 ————————————————");
        String books[][] = new String[3][2];//创建一个三层两列的书架
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                if (i == 0 && j == 0) {
                    books[i][j] = "历史类书籍";
                } else if (i == 1 && j == 0) {
                    books[i][j] = "经济类书籍";
                } else if (i == 1 && j == 1) {
                    books[i][j] = "现代科学类书籍";
                }
            }
        }
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                if (books[i][j] == null) System.out.print("  null     ");
                else System.out.print(books[i][j] + "   ");
            }
            System.out.println();
        }
        //春晓
        //
        //唐 孟浩然
        //
        //春眠不觉晓，处处闻啼鸟。
        //
        //夜来风雨声，花落知多少。
        System.out.println("\n———————————————— 编程训练四 ————————————————");
        char[][] Poetry = new char[6][];
        Poetry[0] = new char[]{'春', ' ', '晓'};
        Poetry[1] = new char[]{'[', '唐', ']', ' ', '孟', '浩', '然'};
        Poetry[2] = new char[]{'春', '眠', '不', '觉', '晓'};
        Poetry[3] = new char[]{'处', '处', '闻', '啼', '鸟'};
        Poetry[4] = new char[]{'夜', '来', '风', '雨', '声'};
        Poetry[5] = new char[]{'花', '落', '知', '多', '少'};
        for (int i = 0; i < Poetry.length; i++) {
            for (int j = 0; j < Poetry[i].length; j++) {
                System.out.print(Poetry[i][j]);
            }
            if (i == 0 || i == 1) {
                System.out.println();
            } else if (i % 2 != 0) {
                System.out.println(",");
            } else {
                System.out.println("。");
            }
        }
        //使用foreach遍历二维数组
        int i = 0;
        for (char x[] : Poetry) {
            i++;
            int j = 0;
            for (char a : x) {
                j++;
                if (i == Poetry.length && j == x.length) { //i和j只是用作判断是否为最后一个的变量，用于判断是否输出,
                    System.out.print(a);
                } else {
                    System.out.print(a + ",");
                }
            }
        }

        System.out.println("\n———————————————— 编程训练五 ————————————————");
        for (int a = 0; a < 10; a++) {
            for (int j = 0; j < (60 - 2); j++) {
                System.out.println("第" + (a + 1) + "个箱子正在装第" + (j + 1) + "个鸡蛋");
            }
        }
        System.out.println("\n———————————————— 编程训练六 ————————————————");
        for (int a = 0; a < 10; a++) {
            if (a > 3) {
                for (int j = 0; j < (60 - 2); j++) {
                    System.out.println("第" + (a + 1) + "个箱子正在装第" + (j + 1) + "个鸡蛋");
                }
            } else {
                for (int j = 0; j < 60; j++) {
                    System.out.println("第" + (a + 1) + "个箱子正在装第" + (j + 1) + "个鸡蛋");
                }
            }
        }
        System.out.println("\n———————————————— 编程训练七 ————————————————");
        int[] grade = {71, 89, 67, 53, 78, 64, 92, 56, 74, 85};
        for (int a = 1; a < grade.length; a++) {
            for (int j = 0; j < grade.length - a; j++) {
                if (grade[j] > grade[j + 1]) {
                    int temp = grade[j + 1];
                    grade[j + 1] = grade[j];
                    grade[j] = temp;
                }
            }
        }
        String s = Arrays.toString(grade);
        System.out.println("成绩由小到大排序为:" + s);
        System.out.println("\n———————————————— 编程训练八 ————————————————");
        for (int a = 1; a < grade.length; a++) {
            for (int j = 0; j < grade.length - a; j++) {
                if (grade[j + 1] > grade[j]) {
                    int temp = grade[j];
                    grade[j] = grade[j + 1];
                    grade[j + 1] = temp;
                }
            }
        }
        String s2 = Arrays.toString(grade);
        System.out.println("成绩由大到小排序为:" + s2);
    }
}