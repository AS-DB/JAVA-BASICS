import java.util.Scanner;

class Vehicals{
    void sound(){

    }
}
class car extends Vehicals{
    void sound(){
        System.out.println("pi pi!");
    }
}
class aeroplane extends Vehicals{
    void sound(){
        System.out.println("whisssssss!");
    }
}
class Dynammic_polymorphism{
    public static void main(String[] args) {
        
        //declaring parent class in order to choose according user
        Vehicals a1;
        //object is being intiated for child class here
        car car1 = new car();
        aeroplane aero = new aeroplane();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the your choose between car and aeroplane:\nfor aerolplane(press1)\nfor car(press2)");
        int i=sc.nextInt();

        if(i==1){
            a1 =car1;
            a1.sound();
        }
        else if(i==2){
            a1 =aero;
            a1.sound();
        }
        else
         System.out.println("INvalid choose");

         sc.close();
    }
}