import java.util.*;

class fibo{
public static void main(String Args[]){
int start=0,First=1,sum=0,n;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of terms:");
n = sc.nextInt();

for(int i=start;i<=n;i++)
{
sum=start+First;
System.out.println(sum);
//explanation:- 

start=First;
First=sum;


}


}}