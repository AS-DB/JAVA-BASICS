class Static{
    String name;
    static int i;

    Static(String name){
        this.name = name;
        
        i++; //increase the age object creates intially it will return 1 cause its start with 0
        System.out.println("your name is"+name+"and your age is"+i);
    }
    static void display(){
        System.out.println("your age is:"+i);
    }

}
class StaticMain{
    public static void main(String[] args) {
        
        Static c1 = new Static("ADITYA DAS");
        Static a1 = new Static("ADITYA DAS");
        
        c1.display();
        a1.display();
        
    }
}