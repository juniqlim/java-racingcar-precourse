package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class CarsTest {
    private static final List<Car> cars = Arrays.asList(new Car("juniq"), new Car("mingk"));

    @Test
    void create() {
        assertThatCode(() -> new Cars(cars)).doesNotThrowAnyException();
    }

    @Test
    void move() {
        assertThatCode(() -> new Cars(cars).move()).doesNotThrowAnyException();
    }
}
