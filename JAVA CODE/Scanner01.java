import java.util.*;
class Scanner01 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your name:");
    String name= sc.next();
    System.out.println("YOur name is "+name);

    System.out.println("Enter your age:");
    int age= sc.nextInt();
    System.out.println("YOur age is "+age);

    System.out.println("Enter your favorite charater between a/b/c:");
    char  char01= sc.next().charAt(0);
    System.out.println("YOur facourite character is "+char01);

    System.out.println("Enter your salary:");
    double salary= sc.nextDouble();
    System.out.println("YOur salary is "+salary);

}}
