package Examples.Exceptions_e_try_Catch.Conta;

public class Main {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.depositar(100);
        c.setLimite(100);

        System.out.printf("Saldo atual:", c.getSaldo());
        System.out.println(c);

        try {
            c.sacar(1000);
        }catch (Exception err){
            System.out.println(err);
        }

        System.out.println(c);

        System.out.printf("Saldo atual:", c.getSaldo());

//        Main t = new Main();
//        System.out.println("Incio do Main");
//        t.metodo1();
//        System.out.println("Fim do Main");

    }

    /*private void metodo1() {
        System.out.println("Incio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private void metodo2() {
        System.out.println("Fim do metodo2");
        int[] array = new int[10];

        for (int i = 0; i <= 15; i++) {

            try {
                array[i] = i;
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException err) {
                System.out.println("Erro:" + err);
            }

        }

        System.out.println("Fim do metodo 2");
    }*/
}
