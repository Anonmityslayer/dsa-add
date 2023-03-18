import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ " is greatest");
            }
            else{
                System.out.println(c + " is greatest");
            }
        }
        else {
            if(b>c){
                System.out.println(b + " is greatest");
            }
            else{
                System.out.println(c + " is greatest");
            }
        }
    }
}
