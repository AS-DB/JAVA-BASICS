class Constructor{
    static String Univerisity ="GIET";
    String Name;
    int age;
    Constructor(){
        age=18;
        Name="aditya";
    }
    void display(){
        age=18;
        System.out.println("Hello"+Univerisity);
        System.out.println(Name);
        System.out.println(age);
    }
}
class ConstructorMain{
    public static void main(String args[]){
        
        Constructor a1 =new Constructor();
        a1.display();
    }
}