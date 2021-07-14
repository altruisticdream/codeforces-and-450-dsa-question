import java.util.*;
class calculate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n,ff;
        n=sc.nextLong();
        int sum=0;
        if(n%2==0)
        ff=n/2;
        else
           ff=-1*((n/2)+1);

        System.out.println(ff);

    }
}