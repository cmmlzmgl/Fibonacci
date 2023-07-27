import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();

        System.out.print("Fibonacci Serisi: ");

        int fib1 = 0, fib2 = 1;

        for (int i = 1; fib1 <= n; i++) {
            System.out.print(fib1 + " ");

            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }

        input.close();
    }
}