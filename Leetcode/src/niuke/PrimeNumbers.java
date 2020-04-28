package niuke;

import java.util.Scanner;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/28 15:34
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * 最后一个数后面也要有空格
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long data = sc.nextLong();
        for (int i = 2; i < data + 1; i++) {
            while (data % i == 0) {
                System.out.print(i + " ");
                data = data / i;
            }
        }
    }

}
