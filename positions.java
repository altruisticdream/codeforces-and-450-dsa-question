import java.util.*;
public class positions {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n, a, b, c, r;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=n-a-1;
        if(c>b)
        {
            r=b+1;
        }
        else
        {
            r=c+1;
        }
        System.out.println(r);
    }
}
