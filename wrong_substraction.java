import java.util.*;
public class wrong_substraction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k,i,a;
        int count=0;
        n= sc.nextInt();
        k= sc.nextInt();

        for(i=0;i<k;i++)
        {
            a=n%10;
            if(a==0)
                n=n/10;
            else
                n=n-1;
        }
        System.out.println(n);

    }
}

