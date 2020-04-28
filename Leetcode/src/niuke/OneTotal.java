package niuke;

import java.util.Scanner;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 17:06
 * 题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * <p>
 * 输入描述:
 * 输入一个整数（int类型）
 * <p>
 * 输出描述:
 * 这个数转换成2进制后，输出1的个数
 */
public class OneTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toBinaryString(num);
        System.out.println(s.replaceAll("0", "").length());
    }
}
