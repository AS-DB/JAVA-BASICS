import java.io.*;

class FileReaderMain{
    public static void main(String[] args) throws IOException {
        try{
            FileReader f1 = new FileReader("ReadMe2.txt");
            int i = f1.read();

            while(i!=-1){
                System.out.print((char)i);
                i=f1.read();
            }
            
        }
        catch(Exception e){
            System.out.println("Not such file exists!");
        }

        //eading another file
        try{
            FileReader f2 = new FileReader("ReadMe.txt");
            int i = f2.read();

            while(i!=-1){
                System.out.print((char)i);
                i=f2.read();
            }
            
        }
        catch(Exception e){
            System.out.println("Not such file exists!");
        }
    }
}