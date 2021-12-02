package AA2;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestaVocabulario {

    @Test
    public void teste1() {
        List<String> arr = Arrays.asList(new String[]{"carro", "carro", "abobora", "violão"});
        List<String> arrVoc = Main.geraVocabulario(arr);
        assertEquals(3, arrVoc.size());
        assertEquals("abobora", arrVoc.get(0));
    }

    @Test
    public void teste2() {
        List<String> arr = Arrays.asList(new String[]{"carro", "Carro", "abobora", "violão"});
        List<String> arrVoc = Main.geraVocabulario(arr);
        assertEquals(3, arrVoc.size());
        assertEquals("abobora", arrVoc.get(0));
    }

    @Test
    public void teste3() {
        List<String> arr = Arrays.asList("página, para, mente, Função, página, Página, essa, essa, Ele, página, pai, evitar, para, para, superfície, sociedade, Superfície, novamente, essa, página, Faz, Para, novamente, Ele, rua, Novamente, pai, Faz, sociedade, para, Mente, Mente, Pai, Essa, específico, Pai, evitar, Cavalo, Superfície, Ele, página, Essa, cavalo, faz, Para, ele, rua, Vento, faz, Vento, Faz, pai, faz, específico, Faz, Capital, específico, Sociedade, vento, evitar, Leste, essa, Evitar, Cavalo, Mente, capital, Função, Rua, sociedade, vento, Para, pai, Rua, Pai, página, faz, pai, faz, para, Evitar, Vento, superfície, evitar, função, Função, Essa, Novamente, Para, Rua, Superfície, superfície, Sociedade, mente, Específico, cavalo, superfície, evitar, Mente, evitar, Cavalo, vento, essa".split(", "));
        //garantir consistencia da lista original
        assertEquals(102, arr.size());
        System.out.println(arr);
        assertEquals("mente", arr.get(2));
        assertEquals("Ele", arr.get(8));
        assertEquals("vento", arr.get(100));

        List<String> arrVoc = Main.geraVocabulario(arr);
        System.out.println(arrVoc);

        assertEquals(18, arrVoc.size());
        assertEquals("Capital", arrVoc.get(0));
        assertEquals("Vento", arrVoc.get(17));
        assertEquals("Ele", arrVoc.get(2));
    }
}
