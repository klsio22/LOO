package game_chrono_trigger.skills;
import game_chrono_trigger.characters.Player;
public class Strenght extends Skill {
    public void applySkill(Player p) {
        System.out.println("Applied 'Strength' on Player!");
        p.setStrength( p.getStrength() + 10 );
    }
}
