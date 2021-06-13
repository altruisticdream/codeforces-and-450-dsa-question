import java.util.*;
public class chat_room {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len;
        String str=sc.next();
        String s="hello";
        str.toLowerCase();
        int k=0,a=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==s.charAt(k))
            {
                k++;
                a++;
                if(k==5)
                    break;
            }
        }
        if(a==5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
