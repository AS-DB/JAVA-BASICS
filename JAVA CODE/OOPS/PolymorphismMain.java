class Vehicals{
    void go(){
        
    }
}
class car extends Vehicals{
void go(){
    System.out.println("Car begains moving");
}
}

class Bicycle extends Vehicals{
    void go(){
        System.out.println("Bicycle begains moving");
    }
}
class Boat extends Vehicals{
    void go(){
        System.out.println("Boat begains moving");
    }
}

class PolymorphismMain{
    public static void main(String[] args) {
        car v1= new car();
        Bicycle a1= new Bicycle();
        Boat b1 = new Boat();

        //duck typing like python
        Vehicals[] t1 = {v1,a1,b1};
        for(Vehicals x: t1){
            x.go();
        }
    }
}