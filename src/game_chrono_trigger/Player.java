package game_chrono_trigger;

public class Player {
    private int life;

    public Player(int life) {
        this.life = life;
    }

    public void heal() {
        this.life += 20;
    }

    public void attack(Monster outher ){
        System.out.printf("Player attack Moster: strength= "+35);
        outher.receiverAttack(35);
    }

    public int getLife() {
        return life;
    }

    public void receiverAttack(int stroke){
        this.life -= stroke;
    }

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                '}';
    }

}
