//we will import java.io.File which contain all operation which we require
import java.io.File;

class FirstMain{
public static void main(String[] args) {
    
    //providing the path of the file in here
    File f1= new File("ReadME.txt"); //if its in different location then provide whole path


   //to cheacck whether its existe ot not

   if(f1.exists()){
    System.out.println("Its exists");

    //it help return the path for file
    System.out.println(f1.getAbsolutePath());
   }

   else{
    System.out.println("It doesn't exists");
   }

   //deleting the file
   f1.delete();

}}