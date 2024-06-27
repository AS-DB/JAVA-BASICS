class Encapsulation_car{
    private String make;
    private String modal;
    private int year;
    Encapsulation_car(String make,String modal,int year){
        this.year=year; //this.set_make=make;
        this.make=make;//this.set_model=model;
        this.modal=modal;//this.set_year=year;
    }
    //in order to take value from above class we will use special attributes or methods which are setter and getters
    //getter method
    String get_make(){
        return make;
    }
    String get_modal(){
        return modal;
    }
    int get_year(){
        return year;
    }
    //setter method
    void set_make(String make){
        this.make=make;
    }
    void set_modal(String modal){
        this.modal=modal;
    }
    void set_year(int year){
        this.year=year;
    }

}


class EncapsulationMain{
    public static void main(String[] args) {
        
        Encapsulation_car c1= new Encapsulation_car("LAmborgini", "Z1", 2020);
        //while we try get the value from above class it will show error cause its private
        // System.out.println(c1.year);
        
        //by using getter and setter we can access the value from private 
        System.out.println(c1.get_make());

        c1.set_make("Farrari");
        System.out.println(c1.get_make());

        

    }
}