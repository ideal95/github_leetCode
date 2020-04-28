package niuke;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 16:30
 * 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * <p>
 * 输入描述:
 * 输入一个int型整数
 * <p>
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class UnSameNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
//            Set 不可重复
            Set<String> set = new HashSet<>();
            for (int i = 0; i < sb.length(); i++) {
                if (set.add(sb.substring(i, i + 1))) {
                    System.out.print(sb.substring(i, i + 1));
                }
            }
        }
    }
}
