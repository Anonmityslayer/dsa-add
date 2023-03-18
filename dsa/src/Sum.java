import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number to sum");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float sum = a+b;
        System.out.println("sum of" + a +"+" + b + "=" + sum);
    }
}
