class Overloadded_Constructor{
    int age;
    int weight;
    String name;
    int salary;

    Overloadded_Constructor(int age,int weight,String name){
        this.age= age;
        this.weight= weight;
        this.name = name;       
    }
    Overloadded_Constructor(int age,int weight,String name,int salary){
        this.age= age;
        this.weight= weight;
        this.name = name;
        this.salary = salary;       
    }
}
class Overloadded_ConstructorMain{
    public static void main(String[] args) {
    
        Overloadded_Constructor s1= new Overloadded_Constructor(12, 012,"aditya das");
        
        System.out.println("Here is your all details");
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.weight);

        System.out.println("New constructor with different parameter");
        Overloadded_Constructor s2= new Overloadded_Constructor(12, 012,"aditya das",21221222);
        
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.salary);
        System.out.println(s2.weight);
        
}}