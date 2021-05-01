package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void move() {
        Cars cars = new Cars(Arrays.asList(Car.of("juniq"), Car.of("mingk")));

        cars.move(() -> true);

        assertThat(cars).usingRecursiveComparison()
            .isEqualTo(new Cars(Arrays.asList(Car.of("juniq", 1), Car.of("mingk", 1))));
    }
}
