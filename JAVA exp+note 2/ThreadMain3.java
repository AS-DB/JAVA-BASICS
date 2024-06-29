class Thread3 extends Thread{
    public void start(){
        System.out.println("Start method overrided");
    }
    
    public void run()
    {
        for(int i =0;i<5;i++)
        System.out.println(Thread.currentThread().getName()+"--"+i+"\t getting property"+Thread.currentThread().getPriority());
    }
}

class ThreadMain3{
    public static void main (String...args){
        Thread3 t1 = new Thread3();
        t1.start();// 
        for(int i =11;i<15;i++)
       
            System.out.println(Thread.currentThread().getName()+"--"+i+"\tgetting property"+Thread.currentThread().getPriority());
        }
        
    }
    

