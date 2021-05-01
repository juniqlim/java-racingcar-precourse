package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void create() {
        assertThatCode(() -> new Position(0)).doesNotThrowAnyException();
    }
}
