package AA1;

public class PredioLitoraneo extends Predio {

    protected double distanciaDoMar;
    private double valor ;

    public PredioLitoraneo(int numeroAndares, double distanciaDoMar, int valor) {
        super(0,numeroAndares);
        this.distanciaDoMar = distanciaDoMar;
        this.valor = valor;
    }

    public double calculaAltura() {
        return (numeroAndares * 2.9)/100;
    }
}
