class Simple{
void displayMessage()
{
System.out.println("Hello");
System.out.println("Welcome to java world");
System.out.println("A very good morning");
}

void displayAdd()
{
int x=20,y=40;
System.out.println("Addition of two number is:"+(x+y));
}

}

class SimpleMain{
public static void main(String adi[]){

Simple ob1 = new Simple();
ob1.displayAdd();
ob1.displayMessage();


}
}