package AA1;

/**
 * Esta é uma classe Main para testar a sua implementação. Não modifique esta classe!
 */
public class Main {

    public static void main(String[] args) {
        Predio p1 = new Predio(1000, 11);
        imprimeDetalhes(p1);
        //p1 deve imprimir:
        //  Altura Predio (Alvará: 1000): 40.0m
        //  Imposto Predio (Alvará: 1000): R$1100.0

        Predio p2 = new Predio(1001, 3);
        imprimeDetalhes(p2);
        //p2 deve imprimir:
        //  Altura Predio (Alvará: 1001): 9.0m
        //  Imposto Predio (Alvará: 1001): R$300.0

        //Nota: o último parâmetro do PredioLitoraneo é a distanciaDoMar, vamos usar-lo na aula de Exceptions ;)
        PredioLitoraneo p3 = new PredioLitoraneo(1002, 10, 100);
        imprimeDetalhes(p3);
        //p3 deve imprimir:
        //  Altura PredioLitoraneo (Alvará: 1002): 29.0m
        //  Imposto PredioLitoraneo (Alvará: 1002): R$2000.0

        SobradoDoisPavimentos s1 = new SobradoDoisPavimentos(1003, 3);
        imprimeDetalhes(s1);
        //s1 deve imprimir:
        //  Altura SobradoDoisPavimentos (Alvará: 1003): 11.0m
        //  Imposto SobradoDoisPavimentos (Alvará: 1003): R$150.0
    }

    // Note o polimorfismo, este método recebe "Construção", mas aceita todas as subclasses!
    public static void imprimeDetalhes(Construcao c) {
        System.out.println("\nAltura "+c+": "+ c.calculaAltura()+"m");
        System.out.println("Imposto "+c+": R$"+ c.calculaIPTU());
    }
}
