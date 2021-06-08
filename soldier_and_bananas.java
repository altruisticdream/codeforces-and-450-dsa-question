import java.util.*;
public class soldier_and_bananas {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k,n,w,sol;
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        w=w*(w+1)/2;
        sol=k*w-n;
        if(sol<=0) {
            sol = 0;
        }
            System.out.println(sol);

    }
}
