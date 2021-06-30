import java.util.*;
public class Dragon {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int t=n;
        int c=0;
        while (n-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(s>x)
            {
                s=s+y;
                c++;
            }
        }
        if(c<=t)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
