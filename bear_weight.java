import java.util.*;
public class bear_weight {
    public static void maiin(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int lima=0,bob=0;
        int count=0;
        do
        {
            lima=a*3;
            bob=b*2;
            count++;


        }while (lima<=bob);
        System.out.println(count);
    }
}
