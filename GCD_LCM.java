import java.util.Scanner;

public class GCD_LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {            // định lý Euclid để tìm ước chung lớn nhất
            int temp = b;           
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so a va b: "); // nhập số và in số
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("boi chung nho nhat cua " + a + " va " + b + " la: " + gcd(a, b));
        System.out.println("uoc chung lon nhat cua " + a + " va " + b + " la: " + lcm(a, b));
        scanner.close();
    }
}