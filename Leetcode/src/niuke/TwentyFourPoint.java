package niuke;

/**
 * @author lx
 * @version 1.0
 * @date 2020/4/29 14:45
 */
public class TwentyFourPoint {
    private static boolean check(int[] num, int[] temp, double result) {
        for (int i = 0; i < num.length; i++) {
            if (temp[i] == 0) {
                temp[i] = 1;
                if (check(num, temp, result + num[i])
                        || check(num, temp, result - num[i])
                        || check(num, temp, result * num[i])
                        || check(num, temp, result / num[i])) {
                    return true;
                }
                temp[i] = 0;
            }
        }
        if (result == 24) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] num = {7, 2, 1, 10};
        int[] temp = new int[4];
        check(num, temp, 0.0d);
    }
}
