package niuke;

import java.util.Scanner;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 22:43
 * 题目描述
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * 输入描述:
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 * 输出描述:
 * 删除字符串中出现次数最少的字符后的字符串。
 */
public class LeastStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            //将字符转换为数字，存放在数组中
            int[] num = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int n = (int) (ch - 'a');
                num[n]++;
            }
            //当不知有多少重复次数时的固定操作
            int min = Integer.MAX_VALUE;
//            取出一个最小值
            for (int i = 0; i < 26; i++) {
                if (num[i] != 0 && num[i] < min) {
                    min = num[i];
                }
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int n = (int) (ch - 'a');
//                如果已存在的num[n]不等于min 就一个一个打印
                if (num[n] != min) {
                    System.out.print(ch);
                }
            }
            System.out.println();//平台本身问题，需要输出这一句
        }
    }
}
