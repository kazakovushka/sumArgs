import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntCounterTest {

    @Test
    void sumNoArgs() {
        int[] arr = new int[]{};
        ArrayIntCounter counter = new ArrayIntCounter(arr);
        assertEquals(0, counter.sum());
    }


    @Test
    void  sumIntArgs(){
        int[] arr = new int[]{1,2,3};
        ArrayIntCounter counter = new ArrayIntCounter(arr);
        assertEquals(6, counter.sum());
    }
}