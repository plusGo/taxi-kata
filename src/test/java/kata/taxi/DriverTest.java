package kata.taxi;

import org.junit.Assert;
import org.junit.Test;


public class DriverTest {
    @Test
    public void charge_计算四舍五入之后的车费_cell() {
        // given
        double money = 7.6;
        final Driver driver = new Driver();
        // when
        final double charge = driver.charge(money);

        // then
        Assert.assertEquals(8, charge, 0.01);

    }

    @Test
    public void charge_计算四舍五入之后的车费_floor() {
        // given
        double money = 4.2;
        final Driver driver = new Driver();
        // when
        final double charge = driver.charge(money);

        // then
        Assert.assertEquals(4, charge, 0.01);

    }

    @Test
    public void charge_计算四舍五入之后的车费_stable() {
        // given
        double money = 3;
        final Driver driver = new Driver();
        // when
        final double charge = driver.charge(money);

        // then
        Assert.assertEquals(3, charge, 0.01);

    }
}
