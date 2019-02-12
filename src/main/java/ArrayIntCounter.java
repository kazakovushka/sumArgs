import java.util.stream.IntStream;

public class ArrayIntCounter {

    public static int sum(IntStream intStream) {
        return intStream
                .reduce((x, y) -> (x + y))
                .orElse(0);
    }
}
