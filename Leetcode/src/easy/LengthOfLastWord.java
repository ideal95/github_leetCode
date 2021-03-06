package easy;

import java.util.Scanner;

/**
 * @author : lixiang
 * @date : 2019-12-16 10:23
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LengthOfLastWord {


    public static int lengthOfLastWord(String s) {
//        先去掉头尾的空格；
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
//        找最后一个空格的下标
        int index = s.lastIndexOf(" ");
        return s.length() - index - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int index = str.lastIndexOf(" ");
            System.out.println(str.length() - index - 1);
        }
    }
}
