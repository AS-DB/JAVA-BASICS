import java.util.ArrayList;

class ArrayListMain{
    public static void main(String[] args) {
    ArrayList<String> car = new ArrayList<>();
    //adding elements and showing
    car.add("Lamborgini");
    car.add("mercedes");
    car.add("Supra");
    car.add("BMW");
    
    for (int i=0;i<car.size();i++){
        System.out.println(car.get(i));
    }

    //remove the element
    car.remove(1);
    for (int i=0;i<car.size();i++){
        System.out.println(car.get(i));
    }
    }
}