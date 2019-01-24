import java.util.Arrays;

import static java.lang.Double.*;

public class Aggregator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no args");
        } else {
            int[] arr = new int[args.length];
            try {
                for (int i = 0; i < args.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }
                ArrayIntCounter intCounter = new ArrayIntCounter(arr);
                System.out.println("sum=" + intCounter.sum());

            } catch (NumberFormatException ex) {
                System.out.println("incorrect args");
            }

        }
    }
}


