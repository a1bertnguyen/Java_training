import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = scanner.nextLine();
        int i = s.length();
        while (i>0) {
            System.out.print(s.charAt(i-1));
            i--;
            
        }
        
        
        scanner.close();

    }
}
