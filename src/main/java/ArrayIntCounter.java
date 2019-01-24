import java.util.Arrays;
import java.util.Objects;

public class ArrayIntCounter {
    private int[] arr;

    public ArrayIntCounter(int[] initArray) {
        arr = Objects.requireNonNull(initArray);
    }

    public int sum() {
        int result = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                result = result + arr[i];
            }
        }
        return result;
    }
}
