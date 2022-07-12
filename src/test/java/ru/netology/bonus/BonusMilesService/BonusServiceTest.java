package ru.netology.bonus.BonusMilesService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void testBonusService(int expected, int amount, boolean registered) {


        BonusService service = new BonusService();
        int actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}
