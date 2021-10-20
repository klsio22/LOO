package game_chrono_trigger.characters;

import game_chrono_trigger.skills.Skill;

public class Player extends GameCharacter {
    private int Strength = 35;
    private Skill skill;

    public Player(int life, Skill skill) {
        this.life = life;
        this.skill = skill;
    }

    @Override
    public void attack(GameCharacter outher) {
        System.out.println("Player attack Moster: strength= " + 35);
        outher.receiverAttack(35);
    }

    //O jogador pode aplicar um Skill em si próprio (this)

    public void userSkill() {
        skill.applySkill(this);
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setStrength(int strength) {
        this.Strength = strength;
    }

    public int getStrength() {
        return Strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                '}';
    }

}
