package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void create() {
        assertThatCode(() -> Name.of("juniq")).doesNotThrowAnyException();
    }

    @Test
    void validNameLength() {
        assertThatThrownBy(() -> Name.of("juniql")).isInstanceOf(NameLengthException.class)
            .hasMessageMatching("자동차 이름은 5자 이하여야 합니다.");
    }
}
