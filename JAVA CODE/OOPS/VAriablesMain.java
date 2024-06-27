class VAriables{
    //global level declaration or instance variable
    String name = "Aditya das";

    //static variable
    static int age=12;

    int display(int a,int b){
        //local variable 
        int j=10;
        return j+a+b;
        //System.out.println(a+b+j);
    }
}
class VAriablesMain{
    public static void main (String args[]){
        VAriables s1 = new VAriables();
        int t=s1.display(12,12);
        System.out.printf("thre result is %d",t);
    }
}