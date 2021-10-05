package game_chrono_trigger;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void game() {

        System.out.println("Start game");

        Player player01 = new Player(100);
        Monster monster01 = new Monster(75, 10);

        player01.heal();
        player01.receiverAttack(30);
        println(player01.toString());

    }

    private void battle(Player p, Monster m) {
        println("Batalhe Starts!");
        printStatus(p, m);

        while (p.getLife() > 0 && m.getLife() > 0) {
            //o jogador humano decide o que fazer
            print("1- Attack; 2 - Heal");
            int humanDecision = scanner.nextInt();

            switch (humanDecision) {
                case 1:
                    p.attack(m);
                    break;
                case 2:
                    p.heal();
            }
            //O mostro sempre ataca

            m.attack(p);
            printStatus(p, m);

        }

        if (p.getLife() > m.getLife())
            println("Player wins");
        else
            println("Moster wins");

    }

    private void printStatus(Player p, Monster m) {
        System.out.println(p);
        System.out.println(m);
        System.out.println();
    }


    private void println(String s) {
        System.out.println(s);
    }

    private void print(String s) {
        System.out.print(s);
    }
}
