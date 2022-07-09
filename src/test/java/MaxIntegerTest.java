import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.global.streams.MaxInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxIntegerTest {

    private MaxInteger maxInteger;

    @BeforeEach
    void setup() {
        maxInteger = new MaxInteger();
    }

    @Test
    void isEmptyCollection() {
        assertEquals(Optional.empty(), maxInteger.findMax(new ArrayList<>()));
    }

    @Test
    void findMax() {

        assertEquals(Optional.of(10), maxInteger.findMax(Arrays.asList(10, 2, 3)));
    }

    @Test
    void isNullCollection() {

        assertEquals(Optional.empty(), maxInteger.findMax(null));
    }

    @Test
    void hasOnlyNullValues()
    {
        assertEquals(Optional.empty(), maxInteger.findMax(Arrays.asList(null,null)));
    }

    @Test
    void hasSomeNullValues()
    {
        assertEquals(Optional.of(9), maxInteger.findMax(Arrays.asList(9,null,2)));
    }

}