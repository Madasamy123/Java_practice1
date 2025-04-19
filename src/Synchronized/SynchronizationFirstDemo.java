package Synchronized;



class SharedResource {
    public synchronized void method(String name) {
        for(int i = 0 ; i < 10; i++) {
            System.out.println("Accessed from: " + name);
            try {
                Thread.sleep(100);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }

        }
    }
}

class ThreadOne implements Runnable {
    SharedResource sr;

    public  ThreadOne(SharedResource sr) {
        this.sr = sr;
    }

    @Override
    public void run() {
        this.sr.method("Thread 1");

    }
}

class ThreadTwo implements Runnable {
    SharedResource sr;

    public  ThreadTwo(SharedResource sr) {
        this.sr = sr;
    }

    @Override
    public void run() {
        this.sr.method("Thread 2");
    }
}

public class SynchronizationFirstDemo {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
        Thread t1 = new Thread(new ThreadOne(sr));
        Thread t2 = new Thread (new ThreadTwo(sr));
        t1.start();
        t2.start();
    }
}

