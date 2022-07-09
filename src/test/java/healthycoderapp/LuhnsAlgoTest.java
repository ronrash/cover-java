package healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LuhnsAlgoTest {

    // various scenarios
    // lenght should be 16 --
    // input should be in string but need to validate if all of them ae numbers
    // check for null or empty
    // finallly valid number or not

    @Test
    void should_ReturnTrue_WhenValidCardPassed()
    {
        //given
        String card="4242424242426742";
        // when
        final boolean validCreditCard = LuhnsAlgo.isValidCreditCard(card);
        // then
        assertTrue(validCreditCard,"card is not valid");
    }

    @Test
    void should_ReturnFalse_WhenValidCardPassed()
    {
        //given
        String card="4242424242426741";
        // when
        final boolean validCreditCard = LuhnsAlgo.isValidCreditCard(card);
        // then
        assertFalse(validCreditCard,"card is invaild");
    }


    @Test
    void should_ThrowRuntimeException_WhenInputIsEmptyOrNullorLessThan16orCardhasInvalidNumbers()
    {

//        assertAll(
//                ()->assertFalse(LuhnsAlgo.isValidCreditCard("")),
//                ()->assertFalse(LuhnsAlgo.isValidCreditCard(null)),
//                ()->assertFalse(LuhnsAlgo.isValidCreditCard("1212312"))
//        );

//        assertThrows(RuntimeException.class,()->LuhnsAlgo.isValidCreditCard(""));
//        assertThrows(RuntimeException.class,()->LuhnsAlgo.isValidCreditCard("121212"));
//        assertThrows(RuntimeException.class,()->LuhnsAlgo.isValidCreditCard(null));
//        assertThrows(RuntimeException.class,()->LuhnsAlgo.isValidCreditCard("424242424242674u"));
        //given
        String card="";
        //when
        Executable executable = ()-> LuhnsAlgo.isValidCreditCard(card);
        //then

        assertThrows(RuntimeException.class,executable);

    }

}