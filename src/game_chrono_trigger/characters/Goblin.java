package game_chrono_trigger.characters;

import game_chrono_trigger.helpers.RandomRange;

public class Goblin extends GameCharacter {

    private int maxStrength;
    private int minStrength;
    private RandomRange random;

    public Goblin(int life, int minStrength, int maxStrength) {
        this.life = life;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
        random = new RandomRange();
    }

    @Override
    public void attack(GameCharacter other) {
        int strength = random.sort(minStrength, maxStrength);
        System.out.println("Goblin attack Player: strength = "+strength);
        other.receiverAttack(strength);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "life=" + life +
                ", maxStrength=" + maxStrength +
                ", minStrength=" + minStrength +
                '}';
    }

}
