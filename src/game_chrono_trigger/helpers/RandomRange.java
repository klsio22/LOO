package game_chrono_trigger.helpers;

import java.util.Random;

//Classe genérica , pode ser usada em qualquer projeto

public class RandomRange {

    private Random random;

    public RandomRange() {
        this.random = new Random();
    }

    /**
     * Sorteia um inteiro aleatório entre dois valores.
     * @param min limite inferio
     * @param max limite superior
     * @return valor sorteado
     */

    public int sort( int max , int min){
        return  min+ random.nextInt(max-min+1);
    }

}
