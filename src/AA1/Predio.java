package AA1;

public class Predio extends Construcao implements ImpostoMunicipal {

    protected Predio(int numeroAlvara, int numeroAndares) {
        super(numeroAlvara, numeroAndares);
    }

    protected double calculaAltura() {
        return numeroAndares >= 1 && numeroAndares <= 10 ? numeroAndares * 3 :
                (numeroAndares * 3) + 7;
    }

    @Override
    public double calculaIPTU() {
        return numeroAndares * 100;
    }
}
