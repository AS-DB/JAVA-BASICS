import java.io.*;

class BufferMain{
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your name:");
        String Name= br.readLine();

        System.out.println("Enter your age:");
        int age= Integer.parseInt(br.readLine());

        
        System.out.println("Enter your salary:");
        float sal= Float.parseFloat(br.readLine());

        System.out.println("Name "+ Name);
        System.out.println("Age"+age);
        System.out.println("Sal"+sal);
    }

}