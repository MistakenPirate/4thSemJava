package Threads;

class Print  {
    //Synchronized Method
    public synchronized void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}


class Thread_x extends Thread   {
    String msg;
    Print p_obj;

    Thread_x (Print pr, String str)   {
        p_obj = pr;
        msg = str;
    }

    public void run()    {
        p_obj.display(msg);
    }
}

public class ThreadSync   {
    public static void main (String[] args)    {
        Print pr_obj  =    new Print ();
        Thread_x   T1  =   new Thread_x(pr_obj, "welcome to ");
        T1.start();
        Thread_x   T2 = new Thread_x(pr_obj, "Java Programming class");
        T2.start();
    }
}