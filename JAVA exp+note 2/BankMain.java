import java.util.*;

class SBI{
void display(int a,int b){
float rate=8.4f;
float total= ((rate*a*b)/100);
System.out.println("Simple interest from SBI:"+(a-total));
}}

class ICICI{
void display(int a,int b){
float rate=7.3f;
float total= ((rate*a*b)/100);
System.out.println("Simple interest from ICICI:"+(a-total));
}}

class Axis{
void display(int a,int b){
float rate=9.7f;
float total= ((rate*a*b)/100);
System.out.println("Simple interest from Axis:"+(a-total));
}}

class BankMain{
public static void main(String ma[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principal amount:");
int a = sc.nextInt();

System.out.println("Enter the Time period(year):");
int b = sc.nextInt();
SBI obj1= new SBI();
ICICI obj2= new ICICI();
Axis obj3= new Axis();

obj1.display(a,b);
obj2.display(a,b);
obj3.display(a,b);
}}