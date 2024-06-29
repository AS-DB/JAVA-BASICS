package p1;

class Package02{
    void o1(){
        System.out.println("hello");
    }
}

class Package01{
    public static void main(String args[]){

        Package02 h =new Package02();
        h.o1();

    }
} 