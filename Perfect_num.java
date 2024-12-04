import java.util.Scanner;
public class Perfect_num {
    public static boolean isPerfect(long n)  {
        long sum = 1;
    for (long i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
        {
            if (i * i != n)
            {
                sum = sum + i + n / i;
            }
            else
            {
                sum = sum + i;
            }
        }
    }

    if (sum == n && n != 1)
    {
        return true;
    }

    return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (isPerfect(n)){
            System.out.println("YES "+n+" is the perfect number");

        }
        else{
            System.out.println("No "+n+" is not the perfect nunber");
        }
        scanner.close();
    }
}
