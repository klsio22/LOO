package AA2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /**
     * Desenvolva aqui a sua atividade.
     *
     * @param listaEnigma lista enviada pelo método main.
     * @return retornar uma listaVocabulario conforme a especificação da atividade.
     */
    public static List<String> geraVocabulario(List<String> listaEnigma) {
        // SEU CÓDIGO AQUI!
        List<String> lista = listaEnigma.stream().distinct().collect(Collectors.toList());
/*
        Set<String> novalista = new HashSet<>(lista);
*/





        return lista;
    }

    /**
     * Não crie nenhum comportamento no método main.
     * É permitido apenas manipular as LISTAS para mudar os parâmetros dos seus testes.
     */
    public static void main(String[] args) {
        // LISTA SIMPLES
        // Use esta lista no início dos seus testes.
        List<String> listaEnigma = Arrays.asList(new String[]{"carro", "Carro", "violão", "abóbora", "violão"});

        // LISTA COMPLETA, USE ESSA LINHA PARA TESTES AVANÇADOS
        // Esta lista é aleatória, muda a cada execução, teste ela depois que finalizar seu código.
        //List<String> listaEnigma = GeradorDeEnigma.gerar();

        System.out.println(listaEnigma);
        System.out.println(listaEnigma.size());

        List<String> listaVocabulario = geraVocabulario(listaEnigma);

        System.out.println(listaVocabulario);
        System.out.println(listaVocabulario.size());
    }
}
