import java.util.*;
public class george_accomodation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b&&(b-a)>1)
                count++;
        }
        System.out.println(count);
    }
}
