import java.util.*;
public class Oleysa {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int t=sc.nextInt();
            int[] arr=new int[t];
            for(int i=0;i<t;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);
           int f=arr[0];
           arr[t-1]=f;
            int sum=0;
            int nn=arr[0];

            for(int i=0;i<arr.length;i++)
            {
            sum+=arr[i]/nn;
            }
            System.out.println(sum);


        }

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
