import java.util.*;
public class HQ9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='H'||ch=='Q'||ch=='9')
                flag=1;
        }
        if(flag>0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
