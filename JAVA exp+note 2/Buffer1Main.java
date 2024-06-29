import java.io.*;

class Buffer1Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your name:");
        String a = br.readLine();
        System.out.println(a);

        System.out.println("Enter your age:");
        int ab = Integer.parseInt(br.readLine());
        System.out.println(ab);
    }
}