import java.util.Scanner;

class Overloading{
    void Display(int a,float Sal)
    {
        System.out.println("Enter your ID"+a);
          System.out.println("Enter your salary"+Sal);
    }

    void Display(int d,String n){
        System.out.println("Enter your ID"+d);
         System.out.println("Enter your NAME"+n);
    }

    void Display(String ab,float Salb){
        System.out.println("Enter your ID"+ab);
          System.out.println("Enter your salary"+Salb);
    }
}

class OverloadingMain{
    public static void main(String[] args) {

        Overloading obj1 = new Overloading();

        int ID;String Name;Float salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID:");
        ID = sc.nextInt();

        System.out.println("Enter your Salary:");
        salary = sc.nextFloat();

        System.out.println("Enter your NAME:");
        Name = sc.next();

        obj1.Display(ID,salary);
        obj1.Display(ID,Name);
        obj1.Display(Name,salary);
    }


    }

