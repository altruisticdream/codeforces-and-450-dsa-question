import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int l = 2*n;
            int a[] = new int[l];
            String line = br.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < l; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            int cntEven = 0, cntOdd = 0;

            for (int i = 0; i < l; i++)
            {
                if (a[i] % 2 == 0)
                    cntEven++;
                else
                    cntOdd++;
            }
            int oddPairs = 0;
            if(cntEven==n&&cntOdd==n)
            {
                System.out.println("YES");
            }else{
                System.out.println("N0");
            }

        }
    }
}