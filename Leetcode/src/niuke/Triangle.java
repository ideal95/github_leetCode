package niuke;

import java.util.Scanner;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/29 16:59
 * 题目描述
 * 1
 * <p>
 * 1  1  1
 * <p>
 * 1  2  3  2  1
 * <p>
 * 1  3  6  7  6  3  1
 * <p>
 * 1  4  10 16 19  16 10  4  1
 * <p>
 * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
 * 输入n(n <= 1000000000)
 * 输入描述:
 * 输入一个int整数
 * <p>
 * 输出描述:
 * 输出返回的int值
 */
public class Triangle {


    /**
     * 找规律 前两行没有偶数
     * 模2余1的都是第二位
     * 模4等于0的在第三位
     * 模4不等于 模2也不等于1的在第四位
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n <= 2) {
                System.out.println(-1);
            } else if (n % 2 == 1) {
                System.out.println(2);
            } else {
                if (n % 4 == 0) {
                    System.out.println(3);
                } else {
                    System.out.println(4);
                }
            }
        }
    }
}
