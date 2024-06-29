class Thread2 extends Thread{
    public void run()
    {
        for(int i =0;i<5;i++)
        System.out.println(Thread.currentThread().getName()+"--"+i+"\t getting property"+Thread.currentThread().getPriority());
    }
}

class ThreadMain2{
    public static void main (String...args){
        Thread2 t1 = new Thread2();
        t1.start();// 
        for(int i =11;i<15;i++)     
        {
            /*if (i==14)
            {
                Thread.currentThread().setPriority(6);
            } */
            System.out.println(Thread.currentThread().getName()+"--"+i+"\tgetting property"+Thread.currentThread().getPriority());
        }
        
    }
}