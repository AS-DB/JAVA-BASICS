class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class SuperHero extends person{
    String power;
    SuperHero(String name,int age,String power){
        //already declared in person class so using super keyword here 
    super(name,age);
    this.power= power;

    System.out.println("You are"+name+"your age is"+age+"and your power to save this world is"+power);
}
}
class SuperMain{
    public static void main(String[] args) {
 SuperHero s1 =new SuperHero("Iron-man",36,"intelligence");       
    }
}   