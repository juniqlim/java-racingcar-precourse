package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void create() {
        assertThatCode(() -> new Cars(Arrays.asList(new Car("juniq"), new Car("mingk"))))
            .doesNotThrowAnyException();
    }
}
