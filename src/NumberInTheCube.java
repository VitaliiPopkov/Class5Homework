import java.util.Scanner;

public class NumberInTheCube {
    static void methodNumberCube() {
        System.out.println("Enter some number: ");
        Scanner scNum = new Scanner(System.in);
        int a = scNum.nextInt();
        double resInCube = Math.pow(a, 3);
        System.out.println("the number in cube is: " + resInCube);
    }

    public static void main(String[] args) {
        methodNumberCube();
        methodNumberCube();

    }
}
