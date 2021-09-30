package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {"the first limit of numbers, 200, 300, 3",
                     "the second limit of numbers, 100, 400, 11"})
    void shouldSquareGivenNumbers(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareGivenNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }
}