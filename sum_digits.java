import java.util.Scanner;

public class sum_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
       
    if (n < 0) {
        n = -n;
    }
    if (n == 0) {
        sum = 0;
    }
        else {
            while (n > 0) {
                int digit = n % 10; 
                sum += digit;
                n /= 10;
            }
    }
    System.out.println("Tong cua cac chu so la "+sum);

        scanner.close();
    }

}
