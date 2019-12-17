package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lixiang
 * @date : 2019-12-17 14:49
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * 示例：
 * n = 15,
 * 返回:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        StringBuilder sb;
        List<String> list =new ArrayList<>();
        for(int i=1;i<=n;i++){
            sb=new StringBuilder();
            if(i%5!=0&&i%3!=0){
                sb.append(i);
            }
            if(i%3==0){
                sb.append("Fizz");
            }
            if(i%5==0){
               sb.append("Buzz");
            }
            list.add(sb.toString());
        }
        return list;
    }
}
