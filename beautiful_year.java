import java.util.*;
public class beautiful_year {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int a,b,c,d;
        while(year<9000)
        {
            year++;
            a=year/1000;
            b=year/100%10;
            c=year/10%10;
            d=year%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
            {
                break;
            }
        }
        System.out.println(year);
    }
}
