import java.io.*;
class Creating_file{
    public static void main(String[] args) throws IOException {
        File f1 =new File("Creating_file.txt");
        //creating a new file
        f1.createNewFile();

    }
}