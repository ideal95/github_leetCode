package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author : lixiang
 * @date : 2019-12-4 18:02
 * leetcode:20 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class IsValid {
    private HashMap<Character, Character> map;

    public IsValid() {
        this.map = new HashMap<>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }

    /**
     * 暴力解决
     */

    public boolean method1(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");

        }
        return s.length() == 0;
    }

    public boolean method2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                char ele = stack.empty() ? '#' : stack.pop();
                if (ele != this.map.get(s.charAt(i))) {
                    stack.push(s.charAt(i));
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        System.out.println(isValid.method1("{[{}]}{}[]{}{}[]"));
    }
}
