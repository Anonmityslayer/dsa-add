import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("enter you name");
        Scanner input = new Scanner(System.in);
        System.out.println("hello there "+input.nextLine());
    }
}
