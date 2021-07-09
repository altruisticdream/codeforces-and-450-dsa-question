import java.util.*;
import java.util.Arrays;
public class newyaer {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        /*int time;
        time = sc.nextInt();
        int total = 240;
        int mint = total - time;

       int product = 0;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            product = product + i * 5;
            if (product <= mint) {
                c++;

            } else
                break;


        }
        System.out.println(c);

       /* while (n-->0)
        {*/
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print(arr[3]-arr[2]+" ");
            System.out.print(arr[3]-arr[1]+" ");
            System.out.print(arr[3]-arr[0]);

           // boolean flag=true;

            /*int j=1;
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
*/
        }

    }

