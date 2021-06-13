import java.util.*;
public class taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int count = 0;
        int sum = 0, summ = 0;

            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]>=3)
                    count+=1;
                else
                    summ=summ+a[i];
            }

        if(sum==n&&sum>1)
            System.out.println(sum/4);
        else if(sum==1)
            System.out.println(sum);
        else
            System.out.println(count+(summ/count));
    }
}
