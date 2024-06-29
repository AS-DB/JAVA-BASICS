import java.util.Scanner;

class A{
    void Display(int a,String b,float Sal){
        System.out.println("Enter your ID"+a);
         System.out.println("Enter your NAME"+b);
          System.out.println("Enter your salary"+Sal);
    }
}

class B{
    void Display(int d,String n,float S){
        System.out.println("Enter your ID"+d);
         System.out.println("Enter your NAME"+n);
          System.out.println("Enter your salary"+S);
    }
}

class C{
    void Display(int ab,String bb,float Salb){
        System.out.println("Enter your ID"+ab);
         System.out.println("Enter your NAME"+bb);
          System.out.println("Enter your salary"+Salb);
    }
}

class OverridingMain{
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        int ID;String Name;Float salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID:");
        ID = sc.nextInt();

        System.out.println("Enter your Salary:");
        salary = sc.nextFloat();

        System.out.println("Enter your NAME:");
        Name = sc.next();

        obj1.Display(ID,Name,salary);
        obj2.Display(ID,Name,salary);
        obj3.Display(ID,Name,salary);
    }


    }

