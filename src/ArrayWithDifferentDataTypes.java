public class ArrayWithDifferentDataTypes {
    public static void main(String[] args) {
        byte[] arr = {1, 2, 3, 4};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        int[] arr1 = new int[4];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        String[] arr2 = {"Hello, ", "World!" };
        System.out.print(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2.length);

        double[] arr3 = new double[3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i * 3;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        char[] arr4 = new char[5];
        arr4[0] = 'H';
        arr4[1] = 'e';
        arr4[2] = 'l';
        arr4[3] = 'l';
        arr4[4] = 'o';
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]);
        }
        System.out.println();

        boolean[] arr5 = new boolean[4];
        for (int i = 0; i < arr5.length ; i=i+2) {
            arr5[i] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr5[i]);
        }





    }
}
