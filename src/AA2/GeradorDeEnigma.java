package AA2;

import java.util.*;

/**
 * Não altere esta classe. Ela serve para gerar a lista base da atividade.
 * Se você tiver curiosidade pode estudar esse código e entender como a listagem
 * é gerada, talvez isso possa lhe inspirar para fazer o processo reverso.
 */
public class GeradorDeEnigma {
    public static List<String> gerar(){
        List<String> listaOriginal = Arrays.asList(palavras.split("\n"));
        ArrayList<String> novaLista = new ArrayList<>();
        Random rand = new Random();

        for(String s: listaOriginal){
            int duplicados = rand.nextInt(10);
            for (int i = 0; i < duplicados; i++) {
                if(rand.nextBoolean()){
                    novaLista.add(s.substring(0, 1).toUpperCase() + s.substring(1));
                }else {
                    novaLista.add(s);
                }
            }
        }

        Collections.shuffle(novaLista);
        return novaLista;
    }


    private static String palavras = "rua\n" +
            "vento\n" +
            "superfície\n" +
            "essa\n" +
            "função\n" +
            "específico\n" +
            "cavalo\n" +
            "sociedade\n" +
            "para\n" +
            "capital\n" +
            "ele\n" +
            "realidade\n" +
            "mente\n" +
            "página\n" +
            "novamente\n" +
            "evitar\n" +
            "certo\n" +
            "leste\n" +
            "faz\n" +
            "momento\n" +
            "pai\n";
}
