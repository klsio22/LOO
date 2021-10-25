package Examples.Abstract_and_Interface;

public class GamePad  implements InputDevice{

    @Override
    public void leDados() {
        System.out.println("Analogico presionado");
    }
}
