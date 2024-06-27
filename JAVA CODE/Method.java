//method class
class function_method{
    void hello(){
        System.out.println("hello world");
    }
}

//main class
class Method{
    public static void main(String[] args) {
        
        //calling method from outside of class

        //instance of object created here
        function_method a1 = new function_method();

        //function calling
        a1.hello();

        //function calling from inside class but outside psvm using static method
        String name= "aditya das";
        
        hello1(name);
        add(2,3);

        }
        static String hello1(String name){
            return name;
        }
        static void add(int a,int b){
            System.out.println("add:"+(a+b));
        }
    }