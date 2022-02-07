package Examples.Programming_parallel;

public class Main {
    public static void main(String[] args) {

        HeavyTask task = new HeavyTask();

        //task.run();
        Thread t1 = new Thread(task);

        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Olá!");
        }

        while (t1.isAlive()){
            System.out.println("Aguardando o fim da Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };



        System.out.println("Isso só pode ser feito depois do fim da Thread!");
    }


    public synchronized void runAlone(){
        System.out.println("I connot run in multiple Threds");
    }


}
