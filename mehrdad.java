import java.math.BigInteger;
import java.util.*;



public class mehrdad {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==0)
        System.out.println("1\n");
    else if(N%4==0)
        System.out.println("6\n");
    else if(N%4==3)
        System.out.println("2\n");
    else if(N%4==2)
        System.out.println("4\n");
    else if(N%4==1)
        System.out.println("8\n");

        /*BigInteger b1,b2;

        b1 = new BigInteger("1378");
        b2=new BigInteger("10");
        int exponent = sc.nextInt();

        // apply pow() method
        BigInteger result = b1.pow(exponent);*/
       // System.out.println(result.mod(b2));

    }
}
