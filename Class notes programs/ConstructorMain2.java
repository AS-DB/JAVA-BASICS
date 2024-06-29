class Employee{
    static String Uname;
    String name;
    int age;
    Employee(){
        name="adi";
        age=12;
    }
    Employee(int ag,String ha){
        ag=age;
        ha=name;
    }

    void display(){
        System.out.println("Uname"+Uname);
        
        System.out.println("name"+name);
        
        System.out.println("age"+age);
    }
}
class ConstructorMain2{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.display();

        Employee e2 = new Employee();
        e2.name =" ADITYA DAS";
        e2.age =18;
        e2.display();
    }
}