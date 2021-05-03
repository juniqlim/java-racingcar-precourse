package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void move() {
        Position position = Position.of(0);

        position.move(() -> true);

        assertThat(position).isEqualTo(Position.of(1));
    }
}
