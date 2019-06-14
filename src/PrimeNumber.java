import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        String conf = "Y";
        Scanner pnumber = new Scanner(System.in);

        while (conf.equals("Y")) {

            System.out.println("Enter a number: ");
            int value = pnumber.nextInt();

            int counter = 0;
            int remainder;


            if (value == 1 || value == -1 || value == 0) {


                System.out.print("This is not a prime number ");

            } else { // if num is 2 or above
                for (int b = 1; b <= 5; b++) {
                    remainder = 5 % b; // c = remainder

                    if (remainder == 0 && (b > 1 && b < 5)) {
                        System.out.println("This is prime number");


//                    if (value % b == 0) {
//                        counter++;
//                    }
//                        if (counter > 2) {
//                            System.out.println("This is not a prime number ");
//
//
//                            break;
//                        }
                    }

//                    if (counter <= 2) {
//                        System.out.println("This is a prime number ");
//
//                    }
                }
                System.out.println("Do you want to continue Y?N ");
                conf = pnumber.next();
            }
//            pnumber.close();

        }
    }
}


