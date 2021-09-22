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

    public void setIncrement(int increment) {
        if(increment >= 0)
            this.increment = increment;
    }

    public void wermUP() {
        if(temperatura < max)
            temperatura += increment;
    }

    public void coll() {
        if(temperatura > min)
            temperatura -= increment;
    }

    public double getTemperatura() {
        return temperatura;
    }

}



