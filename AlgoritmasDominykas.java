import java.util.Arrays;

public class AlgoritmasDominykas {

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

}