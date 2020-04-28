package easy;

import java.util.Scanner;

/**
 * @author : lixiang
 * @date : 2019-12-4 17:19
 * String a="asdsadsadsadsadsadsad"
 * a-z 获取第一个不重复的字母
 */
public class FirstWord {

    public static char getFirstWord(String string){
//        如果字符串为空 直接返回0
        if(string==null||string.length()==0){
            return '0';
        }
//        建立一个对应的a-z 的数组
        int length= string.length();
        int []nums=new int[26];
        for(int i=0;i<length;i++){
//            ‘a’=97; 默认每个初始值为1 一旦重复就大于1
            nums[string.charAt(i)-'a']++;
        }
        for (int i = 0; i <length ; i++) {
//            如果存在nums==1的情况下;那么该字母只出现一次
            if(nums[string.charAt(i)-'a']==1){
                return string.charAt(i);
            }
        }
        return '0';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int[] nums = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int n = (int) (c - 'a');
                nums[n]++;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int n = (int) (c - 'a');
                if (nums[n] == 1) {
                    System.out.println(c);
                    return;
                }
            }
            System.out.println("-1");
        }
    }
}
