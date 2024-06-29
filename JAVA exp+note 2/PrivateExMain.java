class PrivateEx{
     /*private */int a=10;
     /* private */ void m1(){
        System.out.println("a="+a);
    } 
}

class PrivateExMain{
    public static void main(String[] args) {
        PrivateEx obj1 = new PrivateEx();
    
        obj1.m1();
    }
}