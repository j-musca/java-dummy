package myjava.dummy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalcServiceTests {

    private CalcService calcService = new CalcService();

    @Test
    public void sumReturnsCorrectResult0() {
        final int result = calcService.sum(1,2);

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void sumReturnsCorrectResult1() {
        final int result = calcService.sum(3,5);

        assertThat(result).isEqualTo(8);
    }

    @Test
    public void sumReturnsCorrectResult2() {
        final int result = calcService.sum(3,5,7);

        assertThat(result).isEqualTo(15);
    }
}
