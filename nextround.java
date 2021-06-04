import java.util.*;
public class nextround {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int count=0;
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(arr[i]>num) {
                count++;
            }

        }
        if(sum==n)
        {
            System.out.println(n);
        }
        else if(num>10)
            System.out.println(arr.length-n);
        else
        System.out.println(count);


    }

}
