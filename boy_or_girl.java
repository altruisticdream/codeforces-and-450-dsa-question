import java.util.*;
public class boy_or_girl {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string =sc.next();

        char[] chars = string.toCharArray();
        Set<Character> present = new HashSet<>();
        int len = 0;
        for (char c : chars) {
            if (present.add(c))
            {
                chars[len++] = c;
            }
        }
        String st=new String(chars, 0, len);
        if(st.length()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
