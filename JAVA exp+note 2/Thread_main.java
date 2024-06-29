interface Runnable{
public void run();}

class Thread3 implements Runnable{
public void run(){
for (int i=0;i<5;i++)
System.out.println(Thread.currentThread().getName()+i);}}

class Thread_main{
public static void main(String args[]){
Thread3 t1= new Thread3();
Thread obj1 = new Thread(t1);
obj1.start();

for (int i=0;i<5;i++)
System.out.println(Thread.currentThread().getName()+i);}}

