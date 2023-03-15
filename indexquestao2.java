import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int fib1 = 0, fib2 = 1, fib3;

        System.out.print("Sequência de Fibonacci até " + num + ": " + fib1 + " " + fib2);

        while ((fib3 = fib1 + fib2) <= num) {
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }

        if (num == fib2) {
            System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
