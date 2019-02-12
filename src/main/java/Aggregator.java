import java.util.Arrays;
import java.util.stream.IntStream;

public class Aggregator {
    public static void main(String[] args) {
            IntStream str = Arrays.stream(args).parallel()
                    .filter(x -> x.matches("-?\\d+"))
                    .mapToInt(Integer::parseInt);
            System.out.println(ArrayIntCounter.sum(str));
    }
}


