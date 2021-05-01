package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class PositionTest {
    private static final Position position = Position.of(0);

    @Test
    void create() {
        assertThatCode(() -> Position.of(0)).doesNotThrowAnyException();
    }

    @Test
    void increase() {
        assertThat(position.increase()).isEqualTo(Position.of(1));
    }
}
