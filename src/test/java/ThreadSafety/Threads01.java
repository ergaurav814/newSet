package ThreadSafety;

public class Threads01 {

    public static void main(String[] args) {


        ThreadGroup threadgroup = new ThreadGroup("Workers"); // constructor calling

        WorkerTh03 worker1 = new WorkerTh03(threadgroup, "worker1");
        worker1.start(); // if you are using run method directly . it will not execute acc to thread mechanismk

        WorkerTh03 worker2 = new WorkerTh03(threadgroup,"worker2");
        worker2.start();


        for (int i = 1; i <= 10; i++) {

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {

                e.printStackTrace();


            }


        }


      // In this exmaple its shown that how worker 1 and worker 2 and main method content being run on diff threads
        // when worker 1 sleeps fr  2 seconds , worker 2 takes up the process and starts executing on diff thread.
        // content written in main method , will be execute dby main thread only

    }


}

class WorkerTh03 extends Thread {
    public WorkerTh03(ThreadGroup threadgroup , String name) {
        super(threadgroup,name);

        // here we generated constructor
        //super is used to call superclass functionality and made sure , threadgroup and name behaves acc to the superclass

    }

    @Override
    public void run() { //



        for (int i = 1; i <= 10; i++) {

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {

                e.printStackTrace();

            }


        }


    }
}