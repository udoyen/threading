public class MyTest {

    //    private static final Object lock = new Object();
    int index;

    synchronized void  increment() {

        index++;

    }

    synchronized void print() {

        System.out.println(index);


    }
}
