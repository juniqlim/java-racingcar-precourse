package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void create() {
        assertThatCode(() -> new Car("juniq")).doesNotThrowAnyException();
    }
}
