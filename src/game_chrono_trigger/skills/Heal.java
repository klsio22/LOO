package game_chrono_trigger.skills;

import game_chrono_trigger.characters.Player;

public class Heal implements Skill{
    @Override
    public void applySkill(Player p) {
        System.out.println("Applied 'Heal' on Player!");
        p.setLife( p.getLife() + 20 );
    }
}
