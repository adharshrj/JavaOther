package demotest;

class Thread3 implements Runnable {
    java.lang.Thread mthread;
    private String name1;
    Thread3(String name) {
        name1 = name;
    }

    public void run() {
        System.out.println("Thread running" + name1);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(name1);
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    //public void start() {
        //System.out.println("Thread started");
        //if (mthread == null) {
          //  mthread = new java.lang.Thread(this, name1);
            //mthread.start();
       // }

    //}
}
public class ThreadTest {
    public static void main(String[] args) {

        Thread3 thread1 = new Thread3("Thread1");
       // thread1.start();
        new Thread(thread1).start();
        Thread3 thread2 = new Thread3("Thread2");
    //    thread2.start();
        new Thread(thread2).start();
    }
}

