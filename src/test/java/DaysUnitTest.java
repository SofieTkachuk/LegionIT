import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DaysUnitTest {

    // Positive tests - all the days have correct return values

    @ParameterizedTest
    @CsvSource ({"1, Sunday", "2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday"})
    public void positiveCases(int input, String expected) {
        M8 m8 = new M8();
        assertEquals(expected, m8.getDay(input));
    }

    // Negative tests - numbers < 1 and >7

    @ParameterizedTest
    @CsvSource ({"-2, Sunday", "0, Monday", "-3, Tuesday", "-4, Wednesday", "-5, Thursday", "-6, Friday", "-7, Saturday"})
    public void negativeCaseLess1 (int input, String expected) {
        M8 m8 = new M8();
        assertNotEquals(expected, m8.getDay(input));
    }

    @ParameterizedTest
    @CsvSource ({"13, Sunday", "12, Monday", "32, Tuesday", "14, Wednesday", "15, Thursday", "16, Friday", "8, Saturday"})
    public void negativeCaseMore7 (int input, String expected) {
        M8 m8 = new M8();
        assertNotEquals(expected, m8.getDay(input));
    }

    @ParameterizedTest
    @CsvSource ({"3, Sunday", "3, Monday", "5, Tuesday", "7, Wednesday", "9, Thursday", "11, Friday", "13, Saturday"})
    public void negativeCaseWrongValues (int input, String expected) {
        M8 m8 = new M8();
        assertNotEquals(expected, m8.getDay(input));
    }

    // A null value (expect for exception)

    @Test
    public void nullInput() {
        M8 m8 = new M8();
        assertThrows(NullPointerException.class, () -> {
            m8.getDay(null);
        });
    }
}
