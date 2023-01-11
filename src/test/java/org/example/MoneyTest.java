package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");

        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");
    }
    /**
     * isNotEmpty()
     * isLessThan(2)
     * isGreaterThanOrEqualTo(0)
     * isTrue()
     * contains(1)
     *
     * ---- chains
     * isNotEmpty()
     *  .hasSize(10)
     *  .matches("someString")
     */
}