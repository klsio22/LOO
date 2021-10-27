package Examples.Exceptions_e_try_Catch.Conta;

public class Main {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.depositar(100);
        c.setLimite(100);

        System.out.println(c);
        c.sacar(1000);
        System.out.println(c);

    }


}
