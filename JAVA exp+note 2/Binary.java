import java.util.*;
class Binary{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);
int i=0;
double sum=0;
System.out.println("Enter the binary number :");

int a= sc.nextInt();

while (a>0)
{
int r=a%10;
sum= sum +Math.pow(2,i)*r;
a=a/10;
i++;
}

System.out.print(sum);
}}