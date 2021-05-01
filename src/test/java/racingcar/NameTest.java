package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void create() {
        assertThatCode(() -> new Name("juniq")).doesNotThrowAnyException();
    }

    @Test
    void validNameLength() {
        assertThatThrownBy(() -> new Name("juniqlim")).isInstanceOf(NameLengthException.class)
            .hasMessageMatching("자동차 이름은 5자 이하여야 합니다.");
    }
}
