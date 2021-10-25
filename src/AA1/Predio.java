package AA1;

public class Predio extends Construcao {


    public Predio(int numeroAlvara, int numeroAndares) {
        super(numeroAlvara,numeroAndares);
    }


//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + " (Andares: "+numeroAndares+")";
//    }

    public double calculaAltura() {
        return numeroAndares >= 1 && numeroAndares <= 10 ? numeroAndares * 3 :
                (numeroAndares * 3) + 7;
    }
}
