package healthycoderapp;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator();
    }

    @Test
    void should_ReturnTrue_When_DietRecommended() // should_when
    {
        //given
        double weight = 80.0;
        double height = 1.82;
        //when
        final boolean dietNeeded = bmiCalculator.isDietNeeded(weight, height);
        //then
        assertTrue(dietNeeded);
    }
// converting the above test case to paramterized test case
    @ParameterizedTest
    @ValueSource(doubles = {90.0,80.0,75.0})
    void should_ReturnTrueForAllValues_When_DietRecommended(double coderWeight) // should_when
    {
        //given
        double weight = coderWeight;
        double height = 1.82;
        //when
        final boolean dietNeeded = bmiCalculator.isDietNeeded(weight, height);
        //then
        assertTrue(dietNeeded);
    }

    // converting the above test case to paramterized test case with csv --comma separated values when we have multiple inputs
    @ParameterizedTest
    @CsvSource(value = {"90,1.68","75,1.70","100,1.75"})
    void should_ReturnTrueForAllValues_When_DietRecommended(double coderWeight,double coderHeight) // should_when
    {
        //given
        double weight = coderWeight;
        double height = coderHeight;
        //when
        final boolean dietNeeded = bmiCalculator.isDietNeeded(weight, height);
        //then
        assertTrue(dietNeeded);
    }

    @ParameterizedTest
    @CsvFileSource(resources ="")
    void should_ReturnTrueForAllValues_When_DietRecommendedWithCsvFiles(double coderWeight,double coderHeight) // should_when
    {
        //given
        double weight = coderWeight;
        double height = coderHeight;
        //when
        final boolean dietNeeded = bmiCalculator.isDietNeeded(weight, height);
        //then
        assertTrue(dietNeeded);
    }

    @Test
    void should_ReturnFalse_When_DietNotRecommended() // should_when
    {
        //given
        double weight = 60.0;
        double height = 1.82;
        //when
        final boolean dietNeeded = bmiCalculator.isDietNeeded(weight, height);
        //then
        assertFalse(dietNeeded);
    }

    @Test
    void should_ThrowArithmeticException_When_HeightIsZero() {
        //given
        double weight = 60.0;
        double height = 0.0;
        //when
        Executable executable = () -> bmiCalculator.isDietNeeded(weight, height);
        //then
        final ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, executable);
        assertEquals("hieght cannot be 0",arithmeticException.getMessage());
    }

    @Test
    void should_ReturnCoder_WithWorstBmi_WhenCoderListNOtEmpty() {
        //given
        List<Coder> coderList = Arrays.asList(new Coder(1.68, 70),
                new Coder(1.68, 75),
                new Coder(1.69, 75));
        //when
        final Coder codersWithWorstBmi = bmiCalculator.findCodersWithWorstBmi(coderList);
        System.out.println(codersWithWorstBmi);
        //then

        assertAll(
                () -> assertNotNull(codersWithWorstBmi),
                () -> assertEquals(1.68, codersWithWorstBmi.getHeight()),
                () -> assertEquals(75, codersWithWorstBmi.getWeight())
        );

    }

    @Test
    void should_ReturnCorrectBmiScores_When_CoderListNoEmpty()
    {
        //given
        List<Coder> coderList = Arrays.asList(new Coder(1.68, 70),
                new Coder(1.68, 75),
                new Coder(1.69, 75));

        double[] expected ={24.80,26.57,26.26};
        //when
        final double[] bmiScores = BMICalculator.getBMIScores(coderList);

        //then
        assertArrayEquals(expected,bmiScores);
    }

    @Test
    void should_ReturnNull_When_CoderListIsEmpty()
    {
        //given
        List<Coder> coderList= new ArrayList<>();

        //when
        final Coder coderWithWorstBmi = bmiCalculator.findCodersWithWorstBmi(coderList);

        //then
        assertNull(coderWithWorstBmi);
    }
}