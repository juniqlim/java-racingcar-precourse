package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void create() {
        assertThatCode(() -> Car.of("juniq")).doesNotThrowAnyException();
    }

    @Test
    void move() {
        Car car = Car.of("juniq");

        car.move(() -> true);

        assertThat(car).isEqualTo(Car.of("juniq", 1));
    }
}
