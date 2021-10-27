package AA1;

public class PredioLitoraneo extends Predio implements ImpostoMunicipal {

    private double distanciaDoMar;
    private double valor;

    protected PredioLitoraneo(int numeroAlvara, int numeroAndares, double distanciaDoMar) {
        super(numeroAlvara, numeroAndares);
    }

    protected double calculaAltura() {
        return (numeroAndares * 2.9);
    }

    @Override
    public double calculaIPTU() {
        return numeroAndares * 200;
    }

}
