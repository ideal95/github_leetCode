package easy;

/**
    判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    101  121 属于回文数;
 */
public class IsPalindrome {

    /*
    暴力解决; 16ms
    1、x<0肯定不会是回文数；
    2、头尾比较 str.substring截取 或者charAt
     */
    public  boolean method(int x){
        if(x<0){
            return false;
        }
        String str=String.valueOf(x);
        int length=str.length();
            for(int i=0;i<length/2;i++){
                if(!str.substring(i,i+1).equals(str.substring(length-i-1,length-i))){
                    return false;
                }
            }
            return true;

    }
/*
    和取对数有点相似 10ms
 */
    public  boolean method2(int x){
        if(x<0){
            return false;
        }
        long rem=0;
        long y=0;
        int quo=x;
        while(quo!=0){
//            每次取最后一位
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
//        最后比较Y是否等于X
        return y==x;
    }

}
