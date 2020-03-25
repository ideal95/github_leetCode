package niuke;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lx
 * @version 1.0
 * @date 2020/3/24 18:47
 * 输入一个字符串，求出该字符串包含的字符集合
 */
public class SingleStr {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set<String> linkedHashSet=new LinkedHashSet();
        for(int i=0;i<str.length();i++){
            linkedHashSet.add(str.substring(i,i+1));
        }
        Iterator iteratorLinkedHashSet = linkedHashSet.iterator();
        StringBuffer s=new StringBuffer();;
        while(iteratorLinkedHashSet.hasNext()){
            s.append(iteratorLinkedHashSet.next());
        }
        System.out.println(s);
    }
}
