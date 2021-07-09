import java.util.*;
public class Mishka {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0;
        while(n-->0)
        {
            int m,c;
            m= sc.nextInt();
            c= sc.nextInt();
            if(m>c)
                a++;
            if(m<c)
                b++;
        }
        if(a>b)
            System.out.println("Mishka");
        if(b>a)
            System.out.println("Chris");
        if(a==b)
            System.out.println("Friendship is magic!^^");
    }
}
