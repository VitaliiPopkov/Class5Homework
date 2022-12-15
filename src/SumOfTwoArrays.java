public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[3] = 8;
        arr1[4] = 0;

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 3;
        arr2[2] = 5;
        arr2[3] = 7;
        arr2[4] = 9;  //?????
        int[] res = new int[5];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] + arr2[i];
            System.out.println(res[i]);

        }
    }
}
