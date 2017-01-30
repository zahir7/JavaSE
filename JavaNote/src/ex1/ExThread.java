package ex1;

import java.util.Random;

public class ExThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");
        for (int i=0; i < 10; i++) {
            new ChildThread().start();
        }
        System.out.println("Main Thread End");
    }
}
class ChildThread extends Thread {
    public static int _TOTAL = 0;
    public int mCurrentNumber = -1;
    public int mLogCount = 0;
    
    public ChildThread() {
        mCurrentNumber = ++_TOTAL;
    }
    
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                int randNum = random.nextInt(10);
                System.out.println(mCurrentNumber +    
                        " Thread Log // Count : " +    (mLogCount++) +
                        " // randNum : " + randNum);
                Thread.sleep(randNum * 1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

