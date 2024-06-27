class Vehical{
    double speed;
    void start(){
        System.out.println("THis is vechcle is stated");
    }

    void stop(){
        System.out.println("This vehical is stopped");
    }
}

class Truck extends Vehical{
void light(){
    System.out.println("showing light");
}}

class Bicycle extends Truck{

}
class InheritanceMain{
public static void main(String[] args) {
 Vehical v1 = new Vehical();
 v1.start();
 v1.stop();
 
 //single level inheritance

 //truck class inherit the property of Vehical class
 Truck t1 =new Truck();
 t1.light();
 t1.start();
 t1.stop();
 System.out.println(t1.speed);

 //multilevel-inheriance
Bicycle b1 = new Bicycle();
b1.start();
b1.stop();
}}