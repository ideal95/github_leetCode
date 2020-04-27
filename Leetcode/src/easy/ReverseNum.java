package easy;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class ReverseNum {

    /**
     * 解决方案 来自leetCode解析
     */
    public int method1(int x) {
//       新定义一个常量
        long rs = 0;
        while (x != 0) {
//            rs等于rs乘十+%10取余数 1234
//            1、rs=4 x=123 2、rs=40+3，x=12 3、rs=430+2,x=1 4、rs=4320+1 x=0 跳出循环
            rs = rs * 10 + x % 10;
            x /= 10;
        }
//        如果rs 超出Integer范围 返回0;
        return (rs < Integer.MIN_VALUE || rs > Integer.MAX_VALUE) ? 0 : (int) rs;
    }

    /**
     * 思路:
     * int转String String转char 数组
     * 1、判断正负
     * 2、StringBuilder append方法
     * 3、try的理由 转int可能溢出；
     */
    public int method2(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        StringBuilder sb;
        int length = chars.length;
        int a = 0;
        try {
            if (x >= 0) {
                sb = new StringBuilder();
                for (int i = length; i > 0; i--) {
                    sb.append(chars[i - 1]);
                }
            } else {
                sb = new StringBuilder("-");
                sb.append("-");
                for (int i = length; i > 1; i--) {
                    sb.append(chars[i - 1]);
                }
            }
            a = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
        return a;

    }
}
