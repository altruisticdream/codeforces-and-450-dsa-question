import java.util.*;
public class Multiplication_table {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(x%i==0 && x/i<=n)
            {
                c++;
            }
        }
        System.out.println(c);


        /*int a,b,bb,y=0;

        a= sc.nextInt();
        b= sc.nextInt();
        while (a>0) {
            int r=a/10;
            y++;

        }
        int num=(int)Math.pow(10,y);
        int number = 0;
        for(int i=0;i<=num;i++)
        {
            int t=i;
            int c=0;
            while (i>0)
            {
                int rr=i/10;
                c++;
            }
            if((c==y)&&(t%b==0)) {
                number=t;
                break;
            }

        }
        /*b=sc.nextInt();

        int s=a;
        while (s/b>0) {
            a = a + s / b;//Add a new candle
            y = s % b;// Manufactured the remaining unmade candle carcass
            s = s / b + y;
        }
        System.out.println(number);
        */

    }
}
