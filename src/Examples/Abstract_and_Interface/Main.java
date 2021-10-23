package Examples.Abstract_and_Interface;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Primeiro cenario : uma varia para cada

    /*Mouse ms = new Mouse();
    Keyboard tc = new Keyboard();
    Microphones mc = new Microphones();

    ms.leApontador();
    tc.leTecla();
    mc.lesoma();*/

        InputDevice id2 = new Mouse();

        ArrayList<InputDevice> id = new ArrayList<>();
        id.add(new Mouse());
        id.add(new Keyboard());
        id.add(new Microphones());
        id.add(new GamePad());

        for (InputDevice i : id) {
            i.leDados();
        }

    }

}
