import java.util.*;

class Scanner_all_datatype{
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);

            //Intergeral data type
         byte i = sc.nextByte();
         short kk =sc.nextShort();
         int y = sc.nextInt();
         long k = sc.nextLong();
         
         //character
         char a = sc.next().charAt(0);

         //Floating data type
         float kkk= sc.nextFloat();
         double l= sc.nextDouble();

         System.out.println(i+"\t"+kk+"\t"+y+"\t"+k+"\t"+a+"\t"+kkk+"\t"+l);
        }
    }