import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.global.streams.GlobalRelay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GlobalRelayTest {

    private GlobalRelay globalRelay;

    @BeforeEach
    void setup() {
        globalRelay = new GlobalRelay();
    }

    @Test
    void isEmptyCollection() {
        assertEquals(Optional.empty(), globalRelay.findMax(new ArrayList<>()));
    }

    @Test
    void findMax() {

        assertEquals(Optional.of(10), globalRelay.findMax(Arrays.asList(10, 2, 3)));
    }

    @Test
    void isNullCollection() {

        assertEquals(Optional.empty(), globalRelay.findMax(null));
    }

    @Test
    void hasOnlyNullValues()
    {
        assertEquals(Optional.empty(), globalRelay.findMax(Arrays.asList(null,null)));
    }

    @Test
    void hasSomeNullValues()
    {
        assertEquals(Optional.of(9), globalRelay.findMax(Arrays.asList(9,null,2)));
    }

}