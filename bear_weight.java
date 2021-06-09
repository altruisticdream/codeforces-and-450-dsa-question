import java.util.*;
public class bear_weight {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int lima=0,bob=0;
        int count=0;
        lima=a;
        bob=b;
        while(lima<=bob)
        {
            lima=lima*3;
            bob=bob*2;
            count++;
        }
        System.out.println(count);
    }
}
