import java.util.*;
public class XENIA {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n,m,temp=1,cnt = 0;
        n=sc.nextLong();
        m=sc.nextLong();
        for(int i=0;i<m;i++)
        {
            int x=sc.nextInt();
            cnt += ((x - temp) + n) % n;
            temp=x;
        }
        System.out.println(cnt);
    }
}
