import java.util.Scanner;

class Test_1{
    public static void main(String[] args) {
       Scanner scc = new Scanner(System.in);

       System.out.println("Enter the divident part:");
        float i =scc.nextFloat();
        System.out.println("Enter the divisisor part:");
        float f= scc.nextFloat();
        float g= (i/f);
        

        
        System.out.println("float conversion:"+(g));
    }
}
 