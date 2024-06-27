import java.util.ArrayList;
class Arraylist2DMAIN{
    public static void main(String[] args) {
        ArrayList<String> Brands = new ArrayList<>();
    
    Brands.add("Lamborgini");
    Brands.add("mercedes");
    Brands.add("Supra");
    Brands.add("BMW");
    
    ArrayList<String> price = new ArrayList<>();
    price.add("1021200");
    price.add("221200");
    price.add("22221212");
        

        ArrayList<ArrayList<String>> car = new ArrayList<ArrayList<String>>();
        car.add(Brands);
        car.add(price); 

        for(int i=0;i<car.size();i++){
            System.out.print(car.get(i));
        }
    }
}