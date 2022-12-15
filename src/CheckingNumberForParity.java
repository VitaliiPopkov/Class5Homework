import java.util.Scanner;

public class CheckingNumberForParity {
    static void MyMethod() {
        System.out.println("Input some number");
        Scanner scNum = new Scanner(System.in);
        int n = scNum.nextInt();
        if (n % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        MyMethod();


    }
}
