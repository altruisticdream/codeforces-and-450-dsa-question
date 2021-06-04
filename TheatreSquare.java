import java.util.*;
public class TheatreSquare {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int m=sc.nextInt();
       int a=sc.nextInt();

       int i,j;
       i=n/a;
       j=m/a;

       if(i*a!=n)
           i++;
       if(j*a!=m)
           j++;

       System.out.println(i*j);


    }

}
