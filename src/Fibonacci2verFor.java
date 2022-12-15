import java.util.Scanner;

public class Fibonacci2verFor {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        int nIndexEnd;
        System.out.print("Input index of Fibonacci series ");
        Scanner sc = new Scanner(System.in);
        nIndexEnd = sc.nextInt();
        for (int i = 0; i <=nIndexEnd; i++) {
            int counter = i;
            System.out.print(counter + "   ");


        }System.out.println();
        System.out.print(n0 + "   " + n1 + "   ");
        for (int i = 2; i <= nIndexEnd; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + "   ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
