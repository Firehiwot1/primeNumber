import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner keyboared = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = keyboared.nextInt();
        //int input=29;
        boolean isPrime=true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
            }
        if (isPrime){
                System.out.println(input + " is a prime number");

            }
        else{
            System.out.println(input + " is not a prime number");

        }
        }
    }





