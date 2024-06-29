class k1{
    void k1m1(){
        System.out.println("THis statement in k1m1 method");
    }
}

class LI extends k1{
   
    void LIm1(){
        System.out.println("THis statement in LIm1 method");
         super.k1m1();
    }
}

class InheritanceMain02{
    public static void main(String args[]){
        k1 a1= new k1();
        a1.k1m1();
    //  a1.LIm1(); show error cause parent class can't inherent the property from child

        
        System.out.println("\nChild inherit the property from parent class");

        LI a2= new LI();
        a2.LIm1();
        a2.k1m1();

    }
}