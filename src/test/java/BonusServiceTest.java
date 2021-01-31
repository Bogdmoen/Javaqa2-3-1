import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку сравнения (сравниваем ожидаемое с фактическим)
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 26_000_60;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);

    }
}