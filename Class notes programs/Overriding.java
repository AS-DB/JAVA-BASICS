class add_overridingA{
    void add(int a,int b){
        System.out.println(a+b);
    }

}

class add_overridingB{
    
    void add(int a,int b){
        System.out.println(a+b);
    }
}

class add_overridingC{
    
    void add(int a,int b){
        System.out.println(a+b);
    }
}

class Overriding{
    public static void main(String args[]){
        
    add_overridingA a1 =new add_overridingA();
    a1.add(12,23);

    add_overridingB b1 = new add_overridingB();
    b1.add(21,212);

    add_overridingC c1 =new add_overridingC();
    c1.add(21213,1313);
    }
}