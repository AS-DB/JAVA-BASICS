class ArrayMain{
public static void main(String[] args) {
 
    //direct
    String[] car = {"mercedes","porse","bmw"};

    //dynamic
    String[] car1 = new String[3];
    car1[0]="Lamborgini";
    car1[1]="Supra";
    car1[2]="Porse";


    //printing
    for(int i=0;i<car1.length;i++){
        System.out.println(car1[i]);
    }
}}