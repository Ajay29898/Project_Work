import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedExampleTest 
{

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testNumberGreaterThanZero(int number) {
        assertTrue(number > 0);
    }
}
