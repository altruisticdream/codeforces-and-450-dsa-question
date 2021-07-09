import java.util.*;
public class new_year_candle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,y;

        a= sc.nextInt();
        int c=0;
        while (a>0) {
            if(a%2==0)
              a=a/2;

            else {
                c++;
                a = a / 2;
            }
        }
        /*b=sc.nextInt();

        int s=a;
        while (s/b>0) {
            a = a + s / b;//Add a new candle
            y = s % b;// Manufactured the remaining unmade candle carcass
            s = s / b + y;
        }*/
        System.out.println(c);
    }
}
