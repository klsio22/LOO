package game_chrono_trigger.characters;

public class Gargula extends GameCharacter {
    private int flag = 1;

    public Gargula(int life) {
        this.life = life;
    }

    @Override
    public void attack(GameCharacter outher) {
        int strength = 20 * flag;
        flag = 1 - flag;
        //se flag==1 -> 1-1 = 0
        // ser flag==0 -> 1-0 = 0
        System.out.println("Gargula attack Player: strength = " + strength);
        outher.receiverAttack(strength);
    }

    @Override
    public String toString() {
        return "Gargula{" +
                "life=" + life +
                '}';
    }

}
