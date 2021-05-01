package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void create() {
        assertThatCode(() -> new Car("juniq")).doesNotThrowAnyException();
    }

    @Test
    void move() {
        Car car = new Car("juniq");

        car.move(() -> true);

        assertThat(car).isEqualTo(new Car("juniq", 1));
    }
}
