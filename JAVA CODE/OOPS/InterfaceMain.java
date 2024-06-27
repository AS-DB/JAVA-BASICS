interface sum{
    void add(int a,int b);
}

interface subtraction{
    void sub(int a,int b);
}

interface divide_mul{
    void mul(int a,int b);
    void div(int a,int b);
}

class Airthmatic implements sum,subtraction,divide_mul{
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void sub(int a,int b){
        System.out.println(a-b);
    }

    public void mul(int a,int b){
        System.out.println(a*b);
    }

    public void div(int a,int b){
        System.out.println(a/b);
    }

}
class InterfaceMain{
    public static void main(String[] args) {
        Airthmatic a1 = new Airthmatic();
        a1.sub(3, 2);
        a1.add(2,3);
        a1.mul(2,30);
        a1.div(21, 210);
    }
}