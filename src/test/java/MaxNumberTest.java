//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import com.global.streams.MaxNumberValidator;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class MaxNumberTest {
//
//    private MaxNumberValidator maxNumber;
//
//    @BeforeEach
//    void setUp() {
//        maxNumber = new MaxNumberValidator();
//    }
//
//    @Test
//    void isMaxNumber() {
//        Integer expected = 10;
//        final List<Integer> list = Arrays.asList(10, 2, 3, 9);
//        final Optional<Integer> actual = maxNumber.calculate(list);
//        assertEquals(expected, actual.get());
//        assertEquals(20, maxNumber.calculate(Arrays.asList(1, 20, 3, 9)).get());
//        assertEquals(30, maxNumber.calculate(Arrays.asList(10, 2, 30, 9)).get());
//        assertEquals(90, maxNumber.calculate(Arrays.asList(10, 2, 3, 90)).get());
//    }
//
//    @Test
//    void collectionIsEmpty() {
//        final List<Integer> list = Arrays.asList();
//        final Optional<Integer> actual = maxNumber.calculate(list);
//        assertEquals(Optional.empty(), actual);
//    }
//
//    @Test
//    void collectionHasNullValues() {
//        assertEquals(200, maxNumber.calculate(Arrays.asList(null, null, 200, 20)));
//    }
//
//    @Test
//    void collectionHasOnlyNullValues() {
//        final List<Integer> list = Arrays.asList(null, null);
//        final Optional<Integer> calculate = maxNumber.calculate(list);
//        assertEquals(Optional.empty(),calculate );
//    }
//
//    @Test
//    void collectionisNull() {
//        final List<Integer> list =null;
//        final Optional<Integer> calculate = maxNumber.calculate(list);
//        assertEquals(Optional.empty(),calculate );
//    }
//
//    @Test
//    void collectionIsNullOrEmpty()
//    {
//        assertThrows(IllegalStateException.class,()->{
//           maxNumber.calculate(null);
//        });
//    }
//}
