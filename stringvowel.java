import java.util.*;
public class stringvowel{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        String stt="";
        String s="aeiouAEIOU";
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y'||ch=='y'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            stt=stt+"";
            }
            else
                stt=stt+"."+ch;
        }
        System.out.println(stt.toLowerCase());



    }

}
