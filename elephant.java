import java.util.*;
public class elephant {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long i=sc.nextLong();
        long t=i/5;
        if(i%5>0)
        {
            t++;
        }
        System.out.println(t);


    }
}
