package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void move() {
        Cars cars = Cars.of(Arrays.asList(Car.of("juniq"), Car.of("mingk")));

        cars.move(() -> true);

        assertThat(cars).usingRecursiveComparison()
            .isEqualTo(Cars.of(Arrays.asList(Car.of("juniq", 1), Car.of("mingk", 1))));
    }

    @Test
    void createByNames() {
        assertThat(Cars.of("juniq,mingk")).usingRecursiveComparison()
            .isEqualTo(Cars.of(Arrays.asList(Car.of("juniq"), Car.of("mingk"))));
    }
}
