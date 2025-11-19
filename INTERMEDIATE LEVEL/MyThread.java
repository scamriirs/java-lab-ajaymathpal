// Ques 20
class MyThread implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++) System.out.println(Thread.currentThread().getName()+" "+i);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "Thread1");
        t1.start();
    }
}
