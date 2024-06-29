import java.io.*;
interface interfaceI1{
    void add();
    void sub();
}

interface interfaceI2 extends interfaceI1{
    void mul();
    void div();
}

class interfaceI1I2{
 public void add(int a,int b){
    System.out.println("add:"+(a+b));
 }

public void sub(int a,int b){
    System.out.println("sub:"+(a-b));
}

public void div(int a,int b){
    System.out.println("div:"+(a/b));
} 
public void mul(int a,int b){
    System.out.println("mul:"+(a*b));
 
 }
}

class InterfaceMain{
    public static void main(String[] args) throws IOException {

        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the value of 1st integer:");
        int v= Integer.parseInt(br.readLine());
        System.out.println("Enter the value of 2nd integer:");
        int m= Integer.parseInt(br.readLine());
        
        interfaceI1I2 obj1= new interfaceI1I2();
        obj1.add(v,m);
        obj1.sub(v, m);
        obj1.mul(v, m);
        obj1.div(v, m);
    }
}