import java.util.Scanner;
import java.util.ArrayList;
class Arraylist{
    public static void main(String[] args) {
        
        ArrayList<String> food= new ArrayList<String>();
      
        //inserting data
        food.add("allu-paratha");
        food.add("Dosa");
        
        //displaying data
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        //replace data or set
        food.set(0,"samosa");
        food.set(1,"panner");
        
        for(int j=0;j<food.size();j++){
            System.out.println(food.get(j));
        }

        //removing data
        food.remove(1);
        for(int k=0;k<food.size();k++){
            System.out.println(food.get(k));
        }

        //inserting data in arraylist using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to insert:");
        int loop= sc.nextInt();
        String ki;
        for(int o=0;o<=loop;o++){
            System.out.println("Enter the element please:");
            ki= sc.next();
            food.add(ki);
        }
        for(int l=0;l<food.size();l++){
            System.out.println(food.get(l));
        }
    }
}   