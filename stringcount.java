import java.util.*;
public class stringcount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            String str=sc.next();
            int len=str.length();
            if(len>5)
            {
                char ch1,ch2;
                ch1=str.charAt(0);
                ch2=str.charAt(len-1);
                System.out.print(ch1);
                System.out.print(len-2);
                System.out.print(ch2);
                System.out.println();

            }

            else
                System.out.println(str);
            len=0;
            n--;
        }


    }

}
