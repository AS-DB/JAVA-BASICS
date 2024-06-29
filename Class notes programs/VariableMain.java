class Variable{
    static String organization =  "google";   //Static variable
    int id=123; //instances variable
    void display(){
        int i=21; //local variable
        System.out.print("Organization"+organization);
        System.out.print("ID:"+id);
    }
}
class VariableMain{
    public static void main(String args[]){
        Variable v =new Variable();
        v.display();
    }
}