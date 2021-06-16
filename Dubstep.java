import java.util.*;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = 0, a = 0;
        char[] ch=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='W'&& ch[i+1]=='U'&& ch[i+2]=='B')
            {
                if (b != 0 && a != 1)
                    System.out.print(" ");
                i = i + 2;
            }
            else
                {
                System.out.print(ch);
                b = 1;
                a = 0;

            }

        }
    }
}

