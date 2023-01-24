package org.example.ch04;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void shouldBe10charactersLong() {
        String validPassword = "asdfgqwert";

        assertThat(PasswordValidator.validate(validPassword)).isTrue();
    }
}
