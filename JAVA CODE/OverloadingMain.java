class Overloading{
    void sum(int a, double b){
        System.out.println(a+b);
    }

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(double a,double b){
        System.out.println(a+b);
    }

    void sum(int a,int b, double c){
        System.out.println(a+b+c);
    }
}

class OverloadingMain{
    public static void main(String[] args) {

        Overloading a1 = new Overloading();

        int a=2,b=3;
        double c=3.234d;

        a1.sum(a, b);
        a1.sum(a, c);
        a1.sum(a, b, c);
    }
}