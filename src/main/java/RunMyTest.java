public class RunMyTest {

    public static void main(String[] args) throws InterruptedException {
        MyTest myTest = new MyTest();
        Runnable r1 = myTest::increment;
        Runnable r2 = myTest::print;

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(r1);
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        Thread[] threads2 = new Thread[10];
        for (int i = 0; i < threads2.length; i++) {
            threads2[i] = new Thread(r2);
            threads2[i].start();
        }

        for(int i = 0; i < threads2.length; i++) {
            threads2[i].join();
        }


    }
}
