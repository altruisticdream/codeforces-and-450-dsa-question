import java.util.*;

public class dreamoon {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int ans=0;
        while(ans<n/2+n%2)
            ans+=m;
        if(ans>n)
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
