package game_chrono_trigger.characters;

/**
 * Superclasse que define todos os personagens
 */

public class GameCharacter{
    protected int life;

    public void receiverAttack(int stroke) {
        this.life -= stroke;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void attack(GameCharacter other){
        // isso vai mudar na proxima aula!
        // este método é só a especificação! quem sabe fazer o comportamento são as subclasses!
    }

}
