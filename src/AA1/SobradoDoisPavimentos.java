package AA1;

public class SobradoDoisPavimentos extends Construcao implements ImpostoMunicipal {

    private double alturaPeDireito;

    protected SobradoDoisPavimentos(int numeroAlvara, double alturaPeDireito) {
        super(numeroAlvara ,0);
        this.alturaPeDireito = alturaPeDireito;
    }

    protected double calculaAltura() {
        return alturaPeDireito*2+5;
    }

    @Override
    public double calculaIPTU() {
        return 150;
    }

}
