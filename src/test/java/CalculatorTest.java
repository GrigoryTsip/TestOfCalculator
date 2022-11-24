import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.Calculator;

import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    double PRECISION = 0.00001;
    Calculator calc = new Calculator();

    @BeforeEach
    public void init() {
        System.out.println("Test begin");
    }

    @AfterEach
    public void finish() {
        System.out.println("End of test");
    }

    @CsvFileSource(files = "src/test/resources/plusArg.csv")
    @ParameterizedTest
    public void plusTest(float a, float b, float expected) {
/*     long d = (long) (expected - calc.plus.apply(a, b)) * 100_000;
       assertEquals(d, 0);
*/
        assertThat((double) expected, Matchers.closeTo((double) calc.plus.apply(a, b), PRECISION));
    }

    @CsvFileSource(files = "src/test/resources/minusArg.csv")
    @ParameterizedTest
    public void minusTest(float a, float b, float expected) {
        // long d = (long) (expected - calc.minus.apply(a, b)) * 100_000;
        // assertEquals(d, 0);

        assertThat((double) expected, Matchers.closeTo((double) calc.minus.apply(a, b), PRECISION));
    }

    @CsvFileSource(files = "src/test/resources/multiplyArg.csv")
    @ParameterizedTest
    public void multiplyTest(float a, float b, float expected) {
        // long d = (long) (expected - calc.multiply.apply(a, b)) * 100_000;
        // assertEquals(d, 0);

        assertThat((double) expected, Matchers.closeTo((double) calc.multiply.apply(a, b), PRECISION));
    }

    @CsvFileSource(files = "src/test/resources/divideArg.csv")
    @ParameterizedTest
    public void divideTest(float a, float b, float expected) {
        try {
            // long d = (long) (expected - calc.divide.apply(a, b)) * 100_000;
            // assertEquals(d, 0);

            assertThat((double) expected, Matchers.closeTo((double) calc.divide.apply(a, b), PRECISION));
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
