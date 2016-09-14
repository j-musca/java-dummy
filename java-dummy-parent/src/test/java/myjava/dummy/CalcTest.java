package myjava.dummy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalcTest {

    @Test
    public void additionShouldBeCorrect() {
        assertThat(add(2,5)).isEqualTo(7);
    }

    private int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
