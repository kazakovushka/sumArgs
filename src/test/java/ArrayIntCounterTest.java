import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntCounterTest {

    @Test
    void sumNoArgs() {
        assertEquals(0, ArrayIntCounter.sum(IntStream.empty()));
    }


    @Test
    void  sumIntArgs(){
        assertEquals(6, ArrayIntCounter.sum(IntStream.of(1,2,3)));
    }

    @Test
    void  sumIntArgs2(){
        assertEquals(2, ArrayIntCounter.sum(IntStream.of(2)));
    }

}