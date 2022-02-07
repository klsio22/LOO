package Examples.Programming_parallel;

public class HeavyTask implements  Runnable{

    @Override
    public void run() {
        System.out.println(PiCalculator.calcPi(100000000));
    }
}
