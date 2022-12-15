import java.util.Scanner;

public class NumberSquaredPlusTwo {
    static void methodNumberSquaredPlus2() {
        System.out.println("Input some number");
        Scanner scNum = new Scanner(System.in);
        int n = scNum.nextInt();
        double resultSquared = Math.pow(n, 2);
        System.out.println("the result of the number squared: " + resultSquared);
        double resultSquaredPlusTwo = resultSquared + 2;
        System.out.println("the result of the number squared plus two: " + resultSquaredPlusTwo);
    }

    public static void main(String[] args) {
        methodNumberSquaredPlus2();
        methodNumberSquaredPlus2();
        methodNumberSquaredPlus2();
        methodNumberSquaredPlus2();
        methodNumberSquaredPlus2();
    }
}


