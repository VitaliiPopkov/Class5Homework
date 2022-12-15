import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("input last number of the Fibonacci Series ");
        Scanner scanner = new Scanner(System.in);
        int someInputNumber = scanner.nextInt();
        int previousNumberFib = 0; int nextNumberFib = 1; int resultFib = 0;
        //          0                      1
         do {
            resultFib = previousNumberFib + nextNumberFib;

            System.out.println("Number fib - " + resultFib);
            previousNumberFib = nextNumberFib;
            nextNumberFib = resultFib;
        }
        while (resultFib < someInputNumber);

    }
}
