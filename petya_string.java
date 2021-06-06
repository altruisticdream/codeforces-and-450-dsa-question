import java.util.*;
public class petya_string{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
            if(str.compareToIgnoreCase(str1)<=-1)
             System.out.println(-1);
            else if(str.compareToIgnoreCase(str1)>=1)
                System.out.println(1);
            else
                System.out.println(0);





    }

}
