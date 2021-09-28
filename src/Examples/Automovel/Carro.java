package Examples.Automovel;

public class Carro {
    //composição das classes
    //se Tem um motor e um freio é composição
    private Motor motor = new Motor();
    private Freio freio = new Freio();


    public void dirigir() {
        motor.acelerar();
        freio.parar();
        //Acelar o motor
        //Papar usando freios
    }

}