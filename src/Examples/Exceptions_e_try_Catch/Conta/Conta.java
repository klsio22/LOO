package Examples.Exceptions_e_try_Catch.Conta;

public class Conta {
    private double limite, saldo;

    protected void depositar(double deposito) {
        saldo += deposito;
    }

    protected void setLimite(double limite) {
        this.limite = limite;
    }

    protected void sacar(double saque) {
        if (saldo > 0)
            saldo -= saque;
    }

    protected double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
