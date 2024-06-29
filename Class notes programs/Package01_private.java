package p1;

/*private*/ class Package_private{ //TO remove error remove private from it
    void o1(){
        System.out.println("hello");
    }
}

class Package01_private{
    public static void main(String args[]){

        Package_private h =new Package_private();
        h.o1();

    }
} 