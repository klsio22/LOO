package Examples.Exceptions_e_try_Catch.Conta;

public class Conta {
    private double limite, saldo;

    protected void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    protected void setLimite(double quantidade) {
        this.limite = quantidade;
    }

    //Obriga o devenvolverdor a escrever o try/catch
    // protected void sacar(double quantidade) throws Exception {
    protected void sacar(double quantidade) {
        if (quantidade > saldo + limite) {
            //          throw new Exception("Erro: quantindade fora do limite");
            //   Double d = null;
            //   d.toString();

            String srt = "Impossivel realizar o saque, " +
                    " seu saldo é de R$: "+ saldo+ ", " +
                    "o valor desejado é R$"+quantidade;
            throw new SaldoInsuficienteExeception(srt,saldo,quantidade);
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
