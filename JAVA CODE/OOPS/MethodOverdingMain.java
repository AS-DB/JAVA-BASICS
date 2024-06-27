class Man{
    void voice(){
        System.out.println("blah!");
    }
}

class Dog{
    void voice(){
        System.out.println("yo bro!");
    }
}


class MethodOverdingMain{
    public static void main(String[] args) {
Man m1 =new Man();
Dog d1 = new Dog();

m1.voice();
d1.voice();        
    }
}