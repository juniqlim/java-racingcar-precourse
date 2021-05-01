package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void create() {
        assertThatCode(() -> new Name("juniq")).doesNotThrowAnyException();
    }
}
