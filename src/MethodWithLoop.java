public class MethodWithLoop {
    static int methodWithLoop(int a1, int b1) {
        int res1 = 1;
        for (int i = 1; i <= b1; i++) {
            res1 = res1 * a1;
        }
        return res1;
    }
    public static void main(String[] args) {
        System.out.println(methodWithLoop(3, 2) + methodWithLoop(2, 6));
    }


}
