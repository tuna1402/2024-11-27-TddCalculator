package com.ll;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TddCalTest {
    @Test
    public void addTest() {
        polynomialCal calculator = new polynomialCal();
        int popoResult = calculator.plus(1, 2);
        int poneResult = calculator.plus(-10, 5);
        int neneResult = calculator.plus(-3, -7);

        assertThat(popoResult).isEqualTo(3);
        assertThat(poneResult).isEqualTo(-5);
        assertThat(neneResult).isEqualTo(-10);
    }

    @Test
    public void subTest() {
        polynomialCal calculator = new polynomialCal();
        int popoResult = calculator.sub(1, 2);
        int poneResult = calculator.sub(-10, 5);
        int neneResult = calculator.sub(-3, -7);

        assertThat(popoResult).isEqualTo(-1);
        assertThat(poneResult).isEqualTo(-15);
        assertThat(neneResult).isEqualTo(4);
    }

    @Test
    public void mulTest() {
        polynomialCal calculator = new polynomialCal();
        int popoResult = calculator.mul(1, 2);
        int poneResult = calculator.mul(-10, 5);
        int neneResult = calculator.mul(-3, -7);

        assertThat(popoResult).isEqualTo(2);
        assertThat(poneResult).isEqualTo(-50);
        assertThat(neneResult).isEqualTo(21);
    }
}
