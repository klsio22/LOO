package Heater;

public class Heater {
    private double temperatura;
    private int max, min, increment;

    public Heater(int max, int min) {
        this.temperatura = 15;
        this.increment = 5;
        this.max = max;
        this.min = min;
    }

    public void wermUP() {
        if (max <= 90)
            temperatura += increment;
    }

    public void coll() {
        if (min >= 15)
            temperatura -= increment;
    }

    public double getTemperatura() {
        return temperatura;
    }


}



