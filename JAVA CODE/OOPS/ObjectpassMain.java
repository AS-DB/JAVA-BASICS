class Objectpass{
void park(car c1){
    System.out.println("The"+c1.name+"parked succesfully");
}   
}


class car{
    String name;
    car(String name){
        this.name=name;
    }
}


class ObjectpassMain{
    public static void main(String[] args) {
        Objectpass ob1 = new Objectpass();
        
        car c1 = new car("Supra");
        car c2 =new car("BMW");


        ob1.park(c1);
        ob1.park(c2);
    }
}