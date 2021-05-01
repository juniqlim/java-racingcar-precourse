package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void increase() {
        Position position = Position.of(0);

        position.move();

        assertThat(position).isEqualTo(Position.of(1));
    }
}
