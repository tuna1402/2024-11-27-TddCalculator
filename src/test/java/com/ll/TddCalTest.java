package com.ll;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TddCalTest {
    @Test
    public void addTest() {
        polynomialCal calculator = new polynomialCal();
        double popoResult = calculator.sum(1, 2);
        double poneResult = calculator.sum(-10, 5);
        double neneResult = calculator.sum(-3, -7);

        assertThat(popoResult).isEqualTo(3.0);
        assertThat(poneResult).isEqualTo(-5.0);
        assertThat(neneResult).isEqualTo(-10.0);
    }

    @Test
    public void subTest() {
        polynomialCal calculator = new polynomialCal();
        double popoResult = calculator.sub(1, 2);
        double poneResult = calculator.sub(-10, 5);
        double neneResult = calculator.sub(-3, -7);

        assertThat(popoResult).isEqualTo(-1);
        assertThat(poneResult).isEqualTo(-15);
        assertThat(neneResult).isEqualTo(4);
    }

    @Test
    public void mulTest() {
        polynomialCal calculator = new polynomialCal();
        double popoResult = calculator.mul(1, 2);
        double poneResult = calculator.mul(-10, 5);
        double neneResult = calculator.mul(-3, -7);

        assertThat(popoResult).isEqualTo(2);
        assertThat(poneResult).isEqualTo(-50);
        assertThat(neneResult).isEqualTo(21);
    }

    @Test
    public void divTest() {
        polynomialCal calculator = new polynomialCal();
        double popoResult = calculator.div(1, 2);
        double poneResult = calculator.div(-10, 5);
        double neneResult = calculator.div(-3, -6);

        assertThat(popoResult).isEqualTo(0.5);
        assertThat(poneResult).isEqualTo(-2.0);
        assertThat(neneResult).isEqualTo(0.5);
    }

    @Test
    public void combineTest1() {
        polynomialCal calculator = new polynomialCal();
        String combnineResult = calculator.polyCal("(3 + 5)");

        assertThat(combnineResult).isEqualTo("3 + 5");

    }

    @Test
    public void stringcalTest1() {
        polynomialCal calculator = new polynomialCal();
        int stringCalResult = calculator.stringCal("3 + 5");

        assertThat(stringCalResult).isEqualTo(8);
    }

    @Test
    public void combineTest2() {
        polynomialCal calculator = new polynomialCal();
        int stringCalResult = calculator.newCal("(3 + 5) * 5");

        assertThat(stringCalResult).isEqualTo(40);
    }
}
