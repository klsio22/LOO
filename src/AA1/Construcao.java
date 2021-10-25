package AA1;

public abstract class Construcao {

    protected int numeroAlvara;
    protected  int numeroAndares;

    public Construcao(int numeroAlvara, int numeroAndares) {
        this.numeroAlvara = numeroAlvara;
        this.numeroAndares = numeroAndares;
    }

    public  abstract double calculaAltura();

    /**
     * Nao altere o metodo toString.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Alvará: "+numeroAlvara+")";
    }
}
