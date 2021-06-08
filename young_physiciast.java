import java.util.*;
public class young_physiciast {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a=0,b=0,c=0;

        int[][] arr=new int[n][3];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            a=a+arr[i][0];
            b=b+arr[i][1];
            c=c+arr[i][2];

        }
        if(a==0&&b==0&&c==0)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");


    }
}
