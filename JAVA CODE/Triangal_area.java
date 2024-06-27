import java.util.*;
class Triangal_area {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    
    System.out.println("Enter the sides three side triangle respectively:\n");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    float s=(a+b+c)/2;
    float d= s*(s-a)*(s-b)*(s-c);
    double z= Math.sqrt(d);

    System.out.println("Area of trianle is:"+z);
}  
}
