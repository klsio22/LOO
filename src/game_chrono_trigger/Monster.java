package game_chrono_trigger;

import java.util.Random;

public class Monster {
    private int life;
    private int maxStrengyh;
    private Random random;

    public Monster(int life, int maxStrengyh) {
        this.life = life;
        this.maxStrengyh = maxStrengyh;
    }

    public void attack(Player outher) {
        int strength = random.nextInt(maxStrengyh + 1);
        System.out.printf("Moster attack Player: strength = %d", strength);
        outher.receiverAttack(strength);
    }

    public void receiverAttack(int stroke) {
        this.life -= stroke;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "life=" + life +
                '}';
    }
}