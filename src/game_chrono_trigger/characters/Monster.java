package game_chrono_trigger.characters;

import java.util.Random;

public class Monster extends  GameCharacter {
    private int maxStrengyh;
    private Random random;

    public Monster(int life, int maxStrengyh) {
        this.life = life;
        this.maxStrengyh = maxStrengyh;
        random = new Random();
    }

    public void attack(GameCharacter outher) {
        int strength = random.nextInt(maxStrengyh + 1);
        System.out.printf("Moster attack Player: strength = %d\n", strength);
        outher.receiverAttack(strength);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "life=" + life +
                '}';
    }
}