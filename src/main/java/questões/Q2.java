package questões;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int a = 0;
        int b = 1;
        int fib = a + b;

        System.out.println("Digite um número:");
        N = sc.nextInt();

      
        if (N == 0 || N == 1) {
            System.out.println(N + " pertence à sequência de Fibonacci.");
        } else {
            
            boolean pertence = false;
            while (fib <= N) {
                if (fib == N) {
                    pertence = true;
                    break;
                }
                a = b;
                b = fib;
                fib = a + b;
            }
            if (pertence) {
                System.out.println(N + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(N + " não pertence à sequência de Fibonacci.");
            }
        }
        sc.close();
    }
}
