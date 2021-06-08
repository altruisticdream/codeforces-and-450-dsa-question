import java.util.*;
public class nextround {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int count=0;
        int k=0;
        int sum=0,summ=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(k!=0)
                k=1;

        }
        if(k==1){
            System.out.println("0");
            System.exit(0);}
        int pos=arr[num-1];
        int i=0;
        while(i!=n && arr[i]>=pos)
        {
            if(arr[i]!=0)
            {
                count++;
            }
            i++;
        }
        System.out.println(count);


    }

}
