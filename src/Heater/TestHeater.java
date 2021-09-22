package Heater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHeater {
    private Heater heater;

    @BeforeEach
    public void executeConstruct() {
        heater = new Heater(18, 3);
    }

    @Test
    public void shouldShowTheCurrentValueOfTheHeater() {
        assertEquals(15, heater.getTemperatura());
    }

    @Test
    public void mustCanSettingMaxAndMinOfTheHeater() {
        heater.setIncrement(3);
        heater.wermUP();
        assertEquals(18, heater.getTemperatura());
        heater.wermUP();//no effect
        assertEquals(18, heater.getTemperatura());
        heater.wermUP();//no effect
        assertEquals(18, heater.getTemperatura());

        heater.coll();
        heater.coll();
        assertEquals(12, heater.getTemperatura());

        heater.coll();
        assertEquals(9, heater.getTemperatura());
        heater.coll();
        assertEquals(6, heater.getTemperatura());
        heater.coll();
        assertEquals(3, heater.getTemperatura());
        heater.coll();//no effect
        heater.coll();//no effect
        assertEquals(3, heater.getTemperatura());
    }

}
