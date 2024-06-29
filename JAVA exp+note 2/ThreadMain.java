class Thread1 extends Thread{
    public void run()
    {
        for(int i =0;i<5;i++)
        System.out.println("Child Thread"+i);
    }
}

class ThreadMain{
    public static void main (String...args){
        Thread1 t1 = new Thread1();
        t1.start();// 
        for(int i =11;i<15;i++)
        System.out.println("Main Thread"+i);
    }
}