package AA1;

public class SobradoDoisPavimentos extends Construcao {

    private double alturaPeDireito;

    public SobradoDoisPavimentos(int numeroAlvara, double alturaPeDireito) {
        super(numeroAlvara ,0);
        this.alturaPeDireito = alturaPeDireito;
    }

    public double calculaAltura() {
        return alturaPeDireito*2+5;
    }
}
