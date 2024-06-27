class Encapsulation_car1{
    private String make;
    private String modal;
    private int year;
    Encapsulation_car1(String make,String modal,int year){
        this.year=year; 
        this.make=make;
        this.modal=modal;
    }
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


class ObjectCopy{
    public static void main(String[] args) {
        
        Encapsulation_car1 c1= new Encapsulation_car1("LAmborgini", "Z1", 2020);
        Encapsulation_car1 c2= new Encapsulation_car1("Farrari", "Z12", 2024);
        
        //c1.copy(c2);
        //c1=c2;

        System.out.println(c1);
        System.out.println(c1.get_make());
        System.out.println(c1.get_modal());
        System.out.println(c1.get_year());

        System.out.println();

        System.out.println(c2);
        System.out.println(c2.get_make());
        System.out.println(c2.get_modal());
        System.out.println(c2.get_year());

        

    }
}