class Conversion_toSting{
    String make="Ford";
    String modal="Mustang";
    String color = "red";
    int year =2021;

    //changing the tostring method 
    public String toString(){
        return make+"\n"+modal+"\n"+color+"\n"+year;
    }
}
class Conversion_toStingMain{
public static void main(String[] args) {
    
    Conversion_toSting car = new Conversion_toSting();
    
    //tostring in explicity
    System.out.println(car.toString());
    //tostring method in implicity
    System.out.println(car);   
}
}