import java.util.*;
public class Anton {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
          char[] ch=s.toCharArray();
          HashSet<Character> st=new HashSet<>();
            for(int i=0;i<ch.length;i++)
            {
                //if((ch[i]!='{')&&(ch[i]!='}')&&(ch[i]!=','))
                st.add(ch[i]);

            }
        System.out.println(st);
        for(int i=0;i<ch.length;i++)
        {
            //if((ch[i]!='{')&&(ch[i]!='}')&&(ch[i]!=','))
            System.out.println(ch[i]);

        }
    }
}
