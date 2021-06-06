/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        long n=Long.parseLong(br.readLine());

        while(n-->0)
        {
            long D=Long.parseLong(br.readLine());
            long d=Long.parseLong(br.readLine());
            long p=Long.parseLong(br.readLine());
            long q=Long.parseLong(br.readLine());

            long z=D/d;
            if(D%d==0)
            {
                long result=(d*z*p)+q*(z-1)*z*(d/2);
                System.out.println(result+1);
            }
            else
            {
                long result=(d*z*p)+q*(z-1)*z*(d/2);
                long remainder=D%d;
                result = result + remainder*(p*q*z);
                System.out.println(result);
            }
        }
    }
}
