class Constructor01{
    //variables declarationin the class
    int age;
    String name;
    int weight;
    //construction creation with same name  (constructor name = class name)
    Constructor01(int age,String name,int weight){
        this.age= age;
        this.name= name;
        this.weight = weight;

        System.out.printf("Your name is %d, your age is %s and your weight is %d",age,name,weight);
    }   
    
    void say(){
        System.out.println("Hello"+name);
    }
}
class ConstructorMain{
    public static void main(String args[]){

        //parameter should be passed in this as same as arguments for Construtor
        
        Constructor01 c1 = new Constructor01(19,"Aditya das",74);
        c1.say();


    }
}