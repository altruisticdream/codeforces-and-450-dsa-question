import java.util.*;
public class expression {
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max=-1;
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b+c > max)max = a+b+c;
        if(a*(b+c) > max)max = a*(b+c);;
        if((a+b)*c > max)max = (a+b)*c;
        if(a*b*c > max)max = a*b*c;

        System.out.println(max);
        /*a= 3;
        int[] arr=new int[a];
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==1)
            sum++;
        }
        Arrays.sort(arr);
        if(arr[0]==1&&arr[1]>1)
            System.out.println((arr[0]+arr[1])*arr[2]);
        else if(sum>1)
            System.out.println((arr[0]+arr[1])+arr[2]);

        else
            System.out.println((arr[0]*arr[1])*arr[2]);*/

    }
}
