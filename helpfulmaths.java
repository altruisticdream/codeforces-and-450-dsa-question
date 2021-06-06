import java.util.*;
import java.util.Arrays;

public class helpfulmaths{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2="";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0) {
                char ch = str.charAt(i);
                str2=str2+ch;
            }

        }
        char[] chars = str2.toCharArray();
        Arrays.sort(chars);
        String s="";

       for(int j=0;j<chars.length;j++)
       {
           s=s+chars[j]+"+";
       }
        for(int j=0;j<s.length()-1;j++)
        {
            System.out.print(s.charAt(j));
        }



    }

}
