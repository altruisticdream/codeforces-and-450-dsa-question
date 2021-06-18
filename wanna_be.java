import java.util.*;
public class wanna_be {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int[] arr=new int[10000];
        for(int i=0;i<p;i++)
            arr[i]=sc.nextInt();
        int q=sc.nextInt();
        for(int j=p;j<p+q;j++)
            arr[j]=sc.nextInt();
        int flag=0;
        for(int m=1;m<=n;m++) {
            flag=0;
            for (int k = 0; k < p+q; k++) {
                if (m == arr[k]) {
                    flag = 1;
                    break;
                }

            }
            if(flag==0){
                System.out.println("Oh, my keyboard!");
            break;}
        }
        if(flag>0)
            System.out.println("I become the guy.");
    }
}
