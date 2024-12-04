import java.util.Scanner;

public class Prime_Number_Sorter {

    // Kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // bubble sort
    public static void bubbleSort(int[] array, int size) {
        int temporary;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
    }

    // Tìm tất cả các số nguyên tố nhỏ hơn n
    public static void findPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes[count] = i; // Lưu số nguyên tố vào mảng
                count++;
            }
        }

        // Tạo mảng mới có kích thước bằng số lượng số nguyên tố tìm được
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = primes[i];
        }
        bubbleSort(result, count);
        System.out.print("Cac so nguyen to nho hon " + n + " la: ");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("Tong so nguyen to la: "+ count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();
        findPrimes(n);
        scanner.close();
    }
}
