import java.util.*;
public class candies {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a-->0) {
           int n= sc.nextInt();
           if(n%2==0)
               System.out.println((n/2)-1);
           else
               System.out.println(n/2);
        }

    }
}
