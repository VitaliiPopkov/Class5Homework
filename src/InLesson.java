public class InLesson {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int [] arr1 = {2, 3, 5};
        int[] res = new int[3];
        for (int i = 0; i < res.length ; i++) {
            res[i] = arr[i] + arr1[i];
            System.out.println(res[i]);

        }
    }
}


