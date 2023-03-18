import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        //assuming a is always great
        if(a<b){
            a = a + b;
            b = a - b;
            a = a - b;
        }

        int digits = 0;
        int armstong = 0;
        int temp = a;        //checking number of digits in a
        while(temp!=0){
            digits++;
            temp = temp/10;
        }

        int digitb = 0;
        temp =b;
        while(temp!=0){
            digitb++;
            temp = temp/10;
        }

        //checking upto max value for a's number of digits
        if(digitb == digits) {
            for(int i=a; i<10*digits && i<=b; i++){
                int q = 0;
                int original = a;
                while(i!=0){
                    q = (int) (q + Math.pow(i%10,digits));
                    i = i/10;
                }
                if(original == q){
                    System.out.print(original);
                    armstong++;
                }
            }
        }
        //in cases when b has more digits then a;
        int qo=a;
        if(digitb<digits){
            while(digitb<=digits){
                for(int i=qo; i<10*digitb; i++){
                    int q = 0;
                    int original = a;
                    while(i!=0){
                        q = (int) (q + Math.pow(i%10,digitb));
                        i = i/10;
                    }
                    if(original == q){
                        System.out.print(original);
                        armstong++;
                    }
                    qo=i;
                }
                digitb++;
            }
        }
    }
}
