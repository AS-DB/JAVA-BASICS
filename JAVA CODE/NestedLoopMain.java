import java.util.Scanner;

class NestedLoopMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //column in row
        System.out.println("enter the rows number");
        int row= sc.nextInt();
        System.out.println("enter the columns number");
        int column= sc.nextInt();

        for(int i=0;i<=row;i++){
            System.out.println();
            for(int j=0;j<=column;j++){
                System.out.println("*");
            }
        }
    }
}