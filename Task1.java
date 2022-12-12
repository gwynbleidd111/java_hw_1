import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Результат равен " + sum(number()));
    }   
    public static int number() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
        
    }
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n+1; i++) {
            sum = sum + i;
        }
        return sum;
        
    }
}
