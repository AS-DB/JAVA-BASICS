class P1{
    void p1m1(){
        System.out.println("THis statement in p1m1 method");
    }
}

class C1 extends P1{
   
    void c1m1(){

        System.out.println("THis statement in c1m1 method");
    }
}

class InheritanceMain{
    public static void main(String args[]){
        P1 a1= new P1();
        a1.p1m1();
    //  a1.c1m1(); show error cause parent class can't inherent the property from child

        
        System.out.println("\nChild inherit the property from parent class");

        C1 a2= new C1();
        a2.c1m1();
        a2.p1m1();

    }
}