import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            int D, d, P, Q;
            String[] line = br.readLine().trim().split(" ");
            D = Integer.parseInt(line[0]);//total days  5
            d = Integer.parseInt(line[1]); //after d days, increase in rate   2
            P = Integer.parseInt(line[2]);//initial Rate of printing   1
            Q = Integer.parseInt(line[3]);  //increase in rate   2
            int totalMoney;   //  2
            int k = D/d;
            if(k%2==0){
                totalMoney = d*((k/2)* (2*P+(k-1)*Q));
            }
            else {
                totalMoney = d*(k*(P+((k-1)/2)*Q));
            }
            totalMoney += (D%d)*(P+((k)*Q));
            System.out.println(totalMoney);
        }
    }
}