import java.util.Scanner;

public class jazzy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // No. of Packets...
        int count = 0;

        for (int i = 0; i < N; i++) {
            int packet = sc.nextInt();
            if(packet == 1){
                count+=1;
            }
            else {
                int smallestPrimeFactor = calculate(packet);

                if (smallestPrimeFactor == packet) {
                    count += packet + 1;
                } else {
                    count += packet / smallestPrimeFactor + packet + 1;
                }
            }
        }
        System.out.println(count);


    }
    // Function to calculate the smallest divisor except 1;
    private static int calculate(int packet) {
        if(packet%2==0){
            return 2;
        }
        for (int i = 3; i <= (int)Math.sqrt(packet); i+=2) {
            if(packet%i==0){
                return i;
            }
        }
        return packet;
    }
}