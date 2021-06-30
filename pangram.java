import java.util.*;
public class pangram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        str=str.toLowerCase(Locale.ROOT);
        HashSet<Character> arr=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            arr.add(str.charAt(i));
        }
        int c=0;
        for(char ch='a';ch<='z';ch++)
        {
         for(Character ele:arr)
         {
             if(ele==ch)
                 c++;
         }

        }if(c==26)
        System.out.println("YES");
    else
        System.out.println("NO");

    }
}
