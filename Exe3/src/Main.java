import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.println("Please enter positive number");
            num = scanner.nextInt();
        }
        while (num < 0);

        for (int i = num; i >=1 ; i--) {
            if (checkNumber(i)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static boolean checkNumber(int num) {
        boolean primeNumber = true;
        if (num == 2)
            primeNumber = false;

         else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }
        return primeNumber;
    }
}