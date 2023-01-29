import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "1,100,120",
            "2,100,121"
    })
    public void test(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();
        int actual = service.SQRCounter(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}
