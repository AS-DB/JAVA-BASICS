class p1m1n1{
    int id;String name;
    p1m1n1(){
        System.out.println("This is p1m1n1 method");
    }

    p1m1n1(int i,String h){
        i=id; 
        h=name;
    }
}

class l1m1 extends p1m1n1{
    int phone;
    l1m1(){
        System.out.println("This in child class");
    }
   l1m1(int id,String name,int phone){
        super(id,name);
        this.phone = phone;
    }
    void display(){
        System.out.println("ID"+id);
        System.out.println("NAme"+name);
        System.out.println("phone"+phone);
        
    }
}

class InheritanceMain03{
    public static void main(String args[]){
        l1m1 a1= new l1m1();
        a1.display();
    }
}