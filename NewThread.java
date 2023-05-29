/*
Write a Java program to create five threads with different priorities. Send two threads of highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting
*/
class MulThread implements Runnable
{
    static String last;
    String name;
    Thread t;
    MulThread(String n,int p)
    {
        name=n;
        t=new Thread(this, name);
        t.setPriority(p);
        System.out.println(name+" started");
        System.out.println("new thread: "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            if((t.getPriority()==9)||(t.getPriority()==10))
            {
                Thread.sleep(1000);
                System.out.println(t.getName()+" is going to sleep");
            }
            for(int i=0;i<5;i++)
            {
                System.out.println(name+":"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name+" thread interrupted");
        }
        last=name;
        System.out.println(name+" exiting");
    }
}
class NewThread
{
    public static void main(String args[])
    {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        MulThread m1=new MulThread("one",Thread.NORM_PRIORITY-1);
        MulThread m2=new MulThread("two",Thread.MAX_PRIORITY);
        MulThread m3=new MulThread("three",Thread.NORM_PRIORITY+2);
        MulThread m4=new MulThread("four",Thread.NORM_PRIORITY+4);
        MulThread m5=new MulThread("five",Thread.MIN_PRIORITY+1);
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println("main thread interrupted");
        }
        System.out.println("\nThread one is:"+m1.t.isAlive());
        System.out.println("Thread two is:"+m2.t.isAlive());
        System.out.println("Thread three is:"+m3.t.isAlive());
        System.out.println("Thread four is:"+m4.t.isAlive());
        System.out.println("Thread five is:"+m5.t.isAlive()+"\n");
        try
        {
            System.out.println("waiting for thread to finish");
            m1.t.join();
            m2.t.join();
            m3.t.join();
            m4.t.join();
            m5.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("main thread interrupted");
        }
        System.out.println("\nthread one is:"+m1.t.isAlive());
        System.out.println("thread two is:"+m2.t.isAlive());
        System.out.println("thread three is:"+m3.t.isAlive());
        System.out.println("thread four is:"+m4.t.isAlive());
        System.out.println("thread five is:"+m5.t.isAlive()+"\n");
        System.out.println("priority of one:"+m1.t.getPriority());
        System.out.println("priority of two:"+m2.t.getPriority());
        System.out.println("priority of three:"+m3.t.getPriority());
        System.out.println("priority of four:"+m4.t.getPriority());
        System.out.println("priority of five:"+m5.t.getPriority());
        System.out.println();
        System.out.println(MulThread.last+" is long lasting thread");
    }
}
