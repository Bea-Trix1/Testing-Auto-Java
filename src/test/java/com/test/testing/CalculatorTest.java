package com.test.testing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.sum(1, 1)).isEqualTo(2);
    }
}
