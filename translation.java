import java.util.*;
public class translation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        s=s.toLowerCase();
        t=t.toLowerCase();
        StringBuilder ss=new StringBuilder();
        ss.append(s);
        ss.reverse();
        String str=ss.toString();
          if(str.equalsIgnoreCase(t))
              System.out.println("YES");
          else
              System.out.println("NO");

    }
}
