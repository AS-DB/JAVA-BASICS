class User_defiine_function{
    int a=10;
    int b=20;
    public void display(){
        int c= a+b;
        System.out.println(c);
    }
}
class User_defiine_function01Main{
    public static void main(String args[]){
        User_defiine_function a = new User_defiine_function();
        System.out.println("value of a="+a.a);
        System.out.println("value of b="+a.b);
        System.out.println("Sum");
        a.display();
        
    }
}