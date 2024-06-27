class Object{
    void hello(){
        System.out.println("hello");
    }

    void wish(String a){
        System.out.println(a);
    }

}

class ObjectMain{
public static void main(String[] args) {
    
    //object intialization
    Object a1 = new Object();
    Object a2 = new Object();

    String name = "ADITYA DAS";

    a1.hello();
    a1.wish(name);
    
    a2.hello();
    a2.wish(name);
}}