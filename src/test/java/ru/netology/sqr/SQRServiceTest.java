package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/valuesRange.csv")
    public void testFieldSqrt(int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();
        int actual = service.sqrtCount(minRange, maxRange);
        Assertions.assertEquals(expected, actual);
    }
}
