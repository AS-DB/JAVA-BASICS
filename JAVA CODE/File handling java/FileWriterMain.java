import java.io.FileWriter;

class FileWriterMain{
    public static void main(String[] args) {
        try{
            FileWriter f1 =new FileWriter("ReadME.txt");
            //it will write
            f1.write("Hello my name is Aditya");
            //it will add new text 
            f1.append("Hello adi0");
            //it will ensure data is being is stored
            f1.flush();
            //it will close
            f1.close();
        }
        catch(Exception e){
            System.out.println("NO such file exists!");
        }
        
    }
}