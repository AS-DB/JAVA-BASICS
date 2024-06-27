interface Aithmatic_operation1{
    void sum(int a,int b);
    void sub(int a,int b);
}

interface Aithmatic_operation2{
    void mul(int a ,int b);
    void div(int a,int b);
}

class Aithmatic_operation implements Aithmatic_operation1,Aithmatic_operation2{
    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sub(int a,int b){
        System.out.println(a-b);
    }

    public void mul(int a,int b){
        System.out.println(a*b);
    }

    public void div(int a,int b){
        try{
            System.out.println(a+b);
        }
        catch(Exception e){
            System.out.println("NOt divisible by zero");
        }
    }
}

//main class
class InterfaceMain2{
    public static void main (String args[]){
        System.out.println("Testing");
        Aithmatic_operation o1 =new Aithmatic_operation();

        o1.sum(1,2);
        o1.sub(1,2);
        o1.div(1,0);
        o1.mul(2,2);

    }
}