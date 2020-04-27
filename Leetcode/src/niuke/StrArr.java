package niuke;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/27 16:06
 * 输入一个字符串，求出该字符串包含的字符集合
 * 输入描述:
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出
 * 输入例子1:
 * abcqweracb
 * <p>
 * 输出例子1:
 * abcqwer
 */
public class StrArr {
    /**
     * HashSet不重复
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb = new StringBuffer();
            String str = sc.next();
            char[] ch = str.toCharArray();
            Set<Character> set = new HashSet<Character>();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (set.add(ch[i])) {
                    sb.append(ch[i]);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
