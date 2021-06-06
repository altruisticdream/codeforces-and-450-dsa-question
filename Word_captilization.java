import java.util.*;
import java.util.Arrays;

public class Word_captilization{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        for(int i=1;i<str.length();i++)
        {
            str1=str1+str.charAt(i);
        }
        String st=str.substring(0,1);
        st=st.toUpperCase(Locale.ROOT);
        System.out.println(st+str1);


    }

}
