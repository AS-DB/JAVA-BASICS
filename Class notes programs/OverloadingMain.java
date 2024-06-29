class Overloading{
    public void add(){
        int i1=10,i2=20;
        System.out.println(i1+i2);
    }
    public void add(float i,int t){
        System.out.println(i+t);
    }
public void add(float i,float t,int o){
    System.out.println(i+t+o);
}

}
class OverloadingMain{
    public static void main(String args[]){
        
        Overloading a1 =new Overloading();
        a1.add();
        int k=10;float i=20.21f;float l =20.1212f;
        a1.add(l,k);
        a1.add(l,i,k);
    }
}