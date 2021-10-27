package Examples.Exceptions_e_try_Catch.Conta;

public class Conta {
    private double limite, saldo;

    protected void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    protected void setLimite(double quantidade) {
        this.limite = quantidade;
    }

    //Obriga o devenvolverdor
    protected void sacar(double quantidade) throws Exception {
        if (quantidade > this.saldo + this.limite) {
            throw new Exception("Erro: quantindade fora do limite");
        } else {
            saldo -= quantidade;
        }

    }

    public double getSaldo() {
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
