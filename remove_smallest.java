import java.util.*;
import java.util.Arrays;
public class remove_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0)
        {
            int t=sc.nextInt();
            int[] arr = new int[t];
            for (int i = 0; i < t; i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag=true;

            int j=1;
            for (int i = 1; i < t; i++)
            {
                if ((arr[i] - arr[i-1]) > 1) {
                    flag = false;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag)
            {
                System.out.println("YES");
            }

        }
    }
}