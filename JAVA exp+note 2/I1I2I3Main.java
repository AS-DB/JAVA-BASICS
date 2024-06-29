interface I1{
    void sum();
}
interface I2{
    void sub();
    void div();
}
interface I3 extends I1,I2{
    void mul();
}

class I1I2I3 implements I3{
    public void sum(){
        System.out.println("add:"+(10+2));
    }

    public void div(){
        System.out.println("div:"+(10/2));
    }
    public void sub(){
        System.out.println("sub:"+(10-2));
    }
    public void mul(){
        System.out.println("mul:"+(10*2));
    }
}

class I1I2I3Main{
    public static void main(String[] args) {
        I1I2I3 obj1= new I1I2I3();
        obj1.sum();
        obj1.sub();
        obj1.mul();
        obj1.div();
    }
}