abstract class Abstract_parent{
    void display(){
        System.out.println("Hello");
    }

    abstract void display2();
}

class Abstruct_child extends Abstract_parent{
    public void display(){
        System.out.println("I am happy?");
    }

    public void display2(){
        System.out.println("HEllo");
    }
}
class AbstractMain{
    public static void main(String args[]){

       // Abstract_parent a2 = new Abstract_parent();
        //a2.display(); --->error

        Abstruct_child a1= new Abstruct_child();
        a1.display();
        a1.display2();
    }
}