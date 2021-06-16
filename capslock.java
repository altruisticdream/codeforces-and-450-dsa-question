import java.util.*;

public class capslock {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<'Z') {
                str += ch;
                count++;
            }
            else {
                s=s.toLowerCase();
                String chh=s.substring(0,1);
                System.out.println(chh.toUpperCase()+s.substring(1,s.length()));
                break;
            }

        }
        if(count==s.length())
        {
            char[] chhh=s.toCharArray();
            for(int i=0; i<s.length(); i++)
            {
                if(chhh[i]>=65&&chhh[i]<=90)
                    chhh[i]= (char) (97+chhh[i]-65);
                else if(chhh[i]>=97&&chhh[i]<=122)
                    chhh[i]= (char) (65+chhh[i]-97);
            }
            System.out.println(String.valueOf(chhh));
        }



    }
}
