class P1{
void display(){
System.out.println("Hello P1");}}

class C1 extends P1{
void adi(){
super.display();
System.out.println("Hello C2");
}}

class P1C1{
public static void main(String args[]){
C1 obj = new C1();
obj.adi();

}}