package Threads;

class Print2  {
    public void display(String msg)   {
        System.out.print ("[" + msg);
        try   {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println ("]");
    }
}

class Thread_y extends Thread   {
    String msg;
    Print2 p_obj;

    public Thread_y(Print2 pr, String s) {
        p_obj = pr;
        msg = s;
    }

    public void run() {
        synchronized(p_obj)  {
            p_obj.display(msg);
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Print2 pr_obj = new Print2();
        Thread_y T1 = new Thread_y(pr_obj, "welcome");
        T1.start();
        Thread_y T2 = new Thread_y(pr_obj, "new programmer");
        T2.start();
    }
}

