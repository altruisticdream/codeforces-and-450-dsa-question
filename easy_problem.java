import java.util.*;
public class easy_problem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n-->0)
        {
            int a=sc.nextInt();
            sum=sum+a;
        }
        if(sum>=1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
