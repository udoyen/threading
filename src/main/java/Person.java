public class Person {

    public void threading() {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("I am running in thread " + name);

        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
