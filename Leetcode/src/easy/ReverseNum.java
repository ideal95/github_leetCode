package easy;

/**
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class ReverseNum {

    /*
    解决方案 来自leetCode解析
     */
    public int reverse(int x) {
//       新定义一个常量
        long rs = 0;
        while(x != 0){
//            rs等于rs乘十+%10取余数 1234
//            1、rs=4 x=123 2、rs=40+3，x=12 3、rs=430+2,x=1 4、rs=4320+1 x=0 跳出循环
            rs = rs*10+x%10;
            x /= 10;
        }
//        如果rs 超出Integer范围 返回0;
        return (rs<Integer.MIN_VALUE || rs>Integer.MAX_VALUE) ? 0:(int)rs;
    }
}
