package niuke;

import java.util.*;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 16:57
 * 题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class SortString {

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] ss = new String[num];
        for (int i = 0; i < num; i++) {
            ss[i] = sc.next();
        }
        Arrays.sort(ss);
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Vector<String> ve = new Vector<String>();
        for (int i = 0; i < n; i++) {
            ve.add(in.next());
        }
        Collections.sort(ve);
        Iterator it = ve.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
