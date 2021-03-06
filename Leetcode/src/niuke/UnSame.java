package niuke;

import java.util.Scanner;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 17:41
 * 题目描述
 * 密码要求:
 * <p>
 * 1.长度超过8位
 * <p>
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * <p>
 * 3.不能有相同长度超2的子串重复
 * <p>
 * 说明:长度超过2的子串
 * <p>
 * 输入描述:
 * 一组或多组长度超过2的子符串。每组占一行
 * <p>
 * 输出描述:
 * 如果符合要求输出：OK，否则输出NG
 */
public class UnSame {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (JudgeLength(str) && JudgeRepeat(str) && JudgeKinds(str)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    /**
     * 长度判断(>8)
     */

    public static boolean JudgeLength(String str) {
        if (str.length() > 8) {
            return true;
        }
        return false;
    }

    /**
     * 判断不能有相同长度超2的子串重复（>=3）
     */
    public static boolean JudgeRepeat(String str) {
        //length-2刚好循环到倒数第三位
        for (int a = 0; a < str.length() - 2; a++) {
            //字符串的contains方法
            if (str.substring(a + 3).contains(str.substring(a, a + 3))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断大小写字符，数组和其他符号，以上四种或者至少三种
     */
    public static boolean JudgeKinds(String str) {
        char[] Mychar = str.toCharArray();
        int a = 0, b = 0, c = 0, d = 0;
        for (Character x : Mychar) {
            if (x >= 'a' && x <= 'z') {
                a = 1;
            } else if (x >= 'A' && x <= 'Z') {
                b = 1;
            } else if (x >= '0' && x <= '9') {
                c = 1;
            } else {
                d = 1;
            }
            //循环只要满足三种字符类型以上就停止循环，提高运算速度
            if ((a + b + c + d) >= 3) {
                return true;
            }
        }
        //循环之后还是不满足，返回false
        return false;
    }
}
