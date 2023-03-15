import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void FizzBuzzTest01 () {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.checkDivisibleBy3And5(number);
        assertEquals(expected, result);
    }

    @Test
    void FizzBuzzTest02 () {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.checkDivisibleBy3And5(number);
        assertEquals(expected, result);
    }

    @Test
    void FizzBuzzTest03 () {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.checkDivisibleBy3And5(number);
        assertEquals(expected, result);
    }

    @Test
    void Translate01 () {
        String number = "68";
        String expected = "sáu tám";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
}
