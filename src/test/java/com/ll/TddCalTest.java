package com.ll;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TddCalTest {
    @Test
    public void addTest() {
        polynomialCal calculator = new polynomialCal();
        int result = calculator.plus(1, 2);

        assertThat(result).isEqualTo(3);
    }
}
