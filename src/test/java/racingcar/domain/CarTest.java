package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
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

        assertThat(car).usingRecursiveComparison().isEqualTo(Car.of("juniq", 1));
    }

    @Test
    @DisplayName("더 큰 위치를 반환")
    void largerPosition() {
        assertThat(Car.of("juniq").largerPosition(1)).isEqualTo(1);
    }

    @Test
    @DisplayName("같은 포지션인지 확인")
    void equalPosition() {
        assertThat(Car.of("juniq").equalPosition(1)).isFalse();
    }
}
