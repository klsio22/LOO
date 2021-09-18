package Heater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHeater {
    private Heater heater;

    @BeforeEach
    public void executeConstruct() {
        heater = new Heater(0, 0);
    }


    @Test
    public void shouldShowTheCurrentValueOfTheHeater() {
        assertEquals(15, heater.getTemperatura());
    }

    @Test
    public void mustCanSettingTheValueHeater() {
        heater.wermUP();
        heater.wermUP();
        heater.wermUP();
        assertEquals(30, heater.getTemperatura());

        heater.coll();
        heater.coll();
        assertEquals(20, heater.getTemperatura());

    }

    @Test
    public void mustCanSettingMaxAndMinOfTheHeater() {
        heater = new Heater(90, 0);

        assertEquals(15, heater.getTemperatura());

    }


}
