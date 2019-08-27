package kata.taxi;

import org.junit.Assert;
import org.junit.Test;

public class TaxiTest {
    @Test
    public void should_be_6_when_short_than_2() {
        // given
        final Taxi taxis = new Taxi();

        // when
        final double money = taxis.calculate(2, 0);

        // then
        Assert.assertEquals(money, 6, 0.01);
    }

    @Test
    public void should_be_7_when_short_than_2_and_wait_4() {
        // given
        final Taxi taxi = new Taxi();

        // when
        final double money = taxi.calculate(2, 4);
        // then
        Assert.assertEquals(money, 7, 0.01);
    }

    @Test
    public void should_be_7_point_6_when_4_wait_0() {
        // given
        final Taxi taxi = new Taxi();

        // when
        final double money = taxi.calculate(4, 0);
        // then
        Assert.assertEquals(money, 7.6, 0.01);
    }

    @Test
    public void should_be_12_when_9_wait_0() {
        // given
        final Taxi taxi = new Taxi();

        // when
        final double money = taxi.calculate(9, 0);
        // then
        //1.期望值，2.实际值
        Assert.assertEquals(money, 12, 0.01);
    }

    @Test
    public void should_be_13_when_9_wait_4() {
        // given
        final Taxi taxi = new Taxi();
        // when
        final double money = taxi.calculate(9, 4);
        // then
        Assert.assertEquals(13, money, 0.01);
    }
}
