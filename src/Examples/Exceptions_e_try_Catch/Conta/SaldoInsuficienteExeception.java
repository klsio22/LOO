package Examples.Exceptions_e_try_Catch.Conta;

public class SaldoInsuficienteExeception extends RuntimeException {
    private double saldo;
    private double quantidade;

    public SaldoInsuficienteExeception(String message,
                                       double saldo,
                                       double quantidade) {
        super(message);
        this.saldo = saldo;
        this.quantidade = quantidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
