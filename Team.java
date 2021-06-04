import java.util.*;
public class Team {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n-->0)
        {
            int a,b,c;
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();

            if((a+b+c)>=2)
            {
                count++;
            }

        }
        System.out.println(count);


    }

}
