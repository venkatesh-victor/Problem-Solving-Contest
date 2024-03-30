import java.util.Arrays;

public class PushZeroes {

    public static void main(String[] args) {

        int[] arr1 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int[] arr2 = {1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(pushZeroes(arr1)));
        System.out.println(Arrays.toString(pushZeroes(arr2)));
    }

    public static int[] pushZeroes(int[] arr) {
        int[] res = new int[arr.length + 1];

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                res[j++] = arr[i];
            }
        }

        return res;
    }

}
