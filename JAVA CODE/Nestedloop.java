import java.util.*;
class Nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");//outer loop
        int row=sc.nextInt();
        
        System.out.println("Enter the columns:");//inner loop
        int columns=sc.nextInt();

        
        System.out.println("Enter the symbol to use:");
        char a=sc.next().charAt(0);

            for(int i=1;i<=row;i++){
                System.out.println();
                for(int j=i;j<=columns;j++){
                    System.out.println(a);
                }
            }

    }
}
