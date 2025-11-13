class ThreadOne extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Thread1");
                Thread.sleep(2000);
            }
        } catch(Exception e){}
    }
}
class ThreadTwo extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Thread2");
                Thread.sleep(4000);
            }
        } catch(Exception e){}
    }
}
class Main {
    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }
}
