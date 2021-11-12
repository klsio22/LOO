package Examples.Exceptions_e_try_Catch.Conta;

public class Main {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.depositar(100);
        c.setLimite(100);

        System.out.printf("Saldo atual:", c.getSaldo());
        System.out.println(c);

        //c.sacar(1000);

        /*
         Sempre que for tratar uma e Exception busque
         tratar pela classe mais genérica possível. Porém quando for em casos
         específicos, trata o específico depois usa Exception genéricas
          */


        //Nesse caso especificamos nosso erro baseado no problema com o saldo
        try {
            c.sacar(300);
        } catch (SaldoInsuficienteExeception err) {
            System.out.println(err.getMessage());

            double valorEmprestimo = err.getQuantidade() - err.getSaldo();
            System.out.println("O banco te oferece um emprestimo de R$:" +
                    valorEmprestimo);

        }

        /*try {
            c.sacar(1000);
        } catch (NullPointerException err) {
            System.out.println("Erro específico");
        } catch (RuntimeException e) {
            System.out.println("Erro genérico");
        }
*/
       /* try {
            c.sacar(1000);
        } catch (RuntimeException err) {
            System.out.println("Erro genérico");
        }*/


        /*try {
            c.sacar(1000);
        }catch (IllegalArgumentException err){
            System.out.println("Erro do IllegalArgumentException" +err);
        }catch (NullPointerException e){
            System.out.println("Erro do NullPointerException ");
        }*/

        System.out.println(c);


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
