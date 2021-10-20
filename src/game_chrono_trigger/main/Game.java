package game_chrono_trigger.main;

import game_chrono_trigger.characters.*;
import game_chrono_trigger.skills.Heal;
import game_chrono_trigger.skills.Strenght;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        System.out.println("Start Game!");

        //skill inicial, o jogador pode "curar-se" na primeira batalha
        Heal skill1 = new Heal();

        Player p1 = new Player(1000, skill1);
        Monster m1 = new Monster(75, 35);

        battle(p1, m1);

        System.out.println("--------------------------------------------\n\n");

        //skill que substitui a cura, agora o jogador pode "aumentar a própria força"
        Strenght skill2 = new Strenght();
        p1.setSkill(skill2);

        Goblin m2 = new Goblin(50, 10, 20);

        battle(p1, m2);

        System.out.println("--------------------------------------------\n\n");

        Gargula m3 = new Gargula(80);

        battle(p1, m3);
    }

    private void battle(Player p, GameCharacter m) {

        System.out.println("Battle Starts!");

        printStatus(p, m);

        while ( p.getLife() > 0 && m.getLife() > 0  ) {

            //o jogador humano decide o que fazer
            System.out.print("1 - Attack; 2 - Use Skill:");

            int humanDecision = scanner.nextInt();

            switch (humanDecision) {
                case 1:
                    p.attack(m);
                    break;
                case 2:
                    p.userSkill(); //note que o uso da Skill é genérico, não precisamos saber detalhes de como ela funciona.
            }

            //o monstro sempre ataca, eu nao sei que tipo de monstro, nem preciso saber!
            m.attack(p);

            printStatus(p, m);
        }

        if(p.getLife() > m.getLife())
            System.out.println("Player wins!");
        else
            System.out.println("Monster wins!");
    }

    private void printStatus(GameCharacter p, GameCharacter m) {
        System.out.println(p);
        System.out.println(m);
        System.out.println();
    }
}
