package org.example.ch04;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    void shouldBe10charactersLong() {
        PasswordValidator passwordValidator = new PasswordValidator();
        String validPassword = "asdfgqwert";

        assertThat(passwordValidator.validate(validPassword)).isTrue();
    }
}
