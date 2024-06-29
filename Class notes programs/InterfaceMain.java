interface i1{
void add();void sub();
}
interface i2{
void mul();
}
interface i3 extends i1,i2{
void divide();
}

class I1I2I3 implements i3{
    int a=10,b=10;
    public void add(){
        System.out.println(a+b);
    }

    
    public void sub(){
        System.out.println(a-b);
    }

    
    public void mul(){
        System.out.println(a*b);
    }

    
    public void divide(){
        System.out.println(a/b);
    }
}
class InterfaceMain{
    public static void main(String args[]){
        
        I1I2I3 i1 = new I1I2I3();
        i1.add();
        i1.divide();
        i1.mul();
        i1.sub();
    }
}