abstract class Vehical01{
    abstract void go();
    abstract void stop();
}

class Car01 extends Vehical01{
    void go(){
        System.out.println("Vechical is going");
    }
    void stop(){
        System.out.println("car is stopped");
    }
}

class AbstructMain{
    public static void main(String[] args) {
        Car01 c1 =new Car01();
        c1.go();
        c1.stop();
    }
}