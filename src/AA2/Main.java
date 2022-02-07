package AA2;

import java.text.Collator;
import java.util.*;

public class Main {

    /**
     * Desenvolva aqui a sua atividade.
     *
     * @param listaEnigma lista enviada pelo método Main.
     * @return retornar uma listaVocabulario conforme a especificação da atividade.
     */
    public static List<String> geraVocabulario(List<String> listaEnigma) {
        // SEU CÓDIGO AQUI!
        List<String> novalista = new ArrayList<>(listaEnigma);

        removerDuplicados(novalista);
        Collections.sort(novalista, Collator.getInstance());

        return novalista;
    }

    public static void removerDuplicados(List<String> array) {
        Set<String> elemento = new HashSet<String>();

       for (int i = 0; i < array.size(); i++) {
            String interador = array.get(i).toLowerCase();

            // verifique se isto já apareceu antes
            if (!elemento.add(interador)) {
                // se tiver, remova-o
                array.remove(i);
                // diminuir i, pois acabamos de remover o i'ésimo elemento
                i--;
            }
        }
    }

    /**
     * Não crie nenhum comportamento no método Main.
     * É permitido apenas manipular as LISTAS para mudar os parâmetros dos seus testes.
     */
    public static void main(String[] args) {
        // LISTA SIMPLES
        // Use esta lista no início dos seus testes.
        //List<String> listaEnigma = Arrays.asList(new String[]{"carro", "Carro", "violão", "abóbora", "violão"});

        // LISTA COMPLETA, USE ESSA LINHA PARA TESTES AVANÇADOS
        // Esta lista é aleatória, muda a cada execução, teste ela depois que finalizar seu código.
        List<String> listaEnigma = GeradorDeEnigma.gerar();

        System.out.println(listaEnigma);
        System.out.println(listaEnigma.size());

        List<String> listaVocabulario = geraVocabulario(listaEnigma);

        System.out.println(listaVocabulario);
        System.out.println(listaVocabulario.size());
    }
}
