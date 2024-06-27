import java.util.Random;
class Random_value{
public static void main(String args[]){

    Random rn = new Random();
    int x =rn.nextInt(6)+1;
    int y= rn.nextInt(6);

    System.out.println(x);
    System.out.println(y);

    boolean f = rn.nextBoolean();
    System.out.println(f);
}}