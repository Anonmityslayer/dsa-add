import java.util.Scanner;

public class Fiboseq {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        System.out.println("enter number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0,b=1;
        System.out.print(a + "," + b);
        for(int i=2; i<n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(", "+c);
        }
    }
}
