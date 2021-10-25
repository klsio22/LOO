package AA1;

public class PredioLitoraneo extends Predio implements ImpostoMunicipal {

    protected double distanciaDoMar;
    private double valor;

    public PredioLitoraneo(int numeroAlvara, int numeroAndares, double distanciaDoMar) {
        super(numeroAlvara, numeroAndares);
    }

    public double calculaAltura() {
        return (numeroAndares * 2.9)+distanciaDoMar;
    }

    @Override
    public double calculaIPTU() {
        return numeroAndares * 200;
    }

}
