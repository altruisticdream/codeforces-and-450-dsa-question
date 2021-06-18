import java.util.*;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> ll = new ArrayList<>(4);
        for (int i = 0; i < 4; i++)
            ll.add(sc.nextLong());

        Collections.sort(ll);
        int sum=0;
        for(int i=0;i<3;i++)
        {
         if(ll.get(i)==ll.get(i+1))
         {
             sum++;
         }
        }
        System.out.println(sum);
    }
}
