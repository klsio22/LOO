package AA1;

public abstract class Construcao implements ImpostoMunicipal {
    protected int numeroAlvara, numeroAndares;

    protected Construcao(int numeroAlvara, int numeroAndares) {
        this.numeroAlvara = numeroAlvara;
        this.numeroAndares = numeroAndares;
    }

    protected  abstract double calculaAltura();

    /**
     * Nao altere o metodo toString.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Alvará: "+numeroAlvara+")";
    }
}
