import java.util.*;
public class word {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch,ch1;
        int count=0,count1=0;
        for(int i=0;i<s.length();i++)
        for(ch='A';ch<='Z';ch++)
        {
            if(s.charAt(i)==ch)
            {
                count++;
            }
        }
        for(int i=0;i<s.length();i++)
            for(ch='a';ch<='z';ch++)
            {
                if(s.charAt(i)==ch)
                {
                    count1++;
                }
            }

        if(count>count1)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}
