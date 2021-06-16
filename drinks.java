import java.util.*;
public class drinks {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        double flag=0.0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            flag=flag+(double) arr[i]/100.0;
            else
                flag=flag+arr[i];
        }
        System.out.println((flag/n)*100);

    }
}
