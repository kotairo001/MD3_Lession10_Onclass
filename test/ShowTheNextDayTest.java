import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ShowTheNextDayTest {
    @Test
    void TestShowTheNextDay() {
        int date = 14;
        int month = 3;
        int year = 2023;
        LocalDate expected = LocalDate.of(year,month,date).plusDays(1);
        LocalDate result = Main.showTheNextDay(year,month,date);
        assertEquals(expected, result);

    }
}
