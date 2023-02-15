import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServisTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testBonusService.csv")
    public void testRegisteredBonusNoLimit(String nameTest, int amaunt, boolean registred, int expected) {
        BonusServis servis = new BonusServis();
        int actual = servis.calculate(amaunt, registred);
        Assertions.assertEquals(expected, actual);
    }
}
