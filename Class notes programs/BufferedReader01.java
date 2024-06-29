import java.io.*;

class BufferedReader01{
    public static void main(String args[]) throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name,age,salary");
        String name = br.readLine();
        int i= Integer.parseInt(br.readLine());
        
        float t= Float.parseFloat(br.readLine());

        System.out.println(name+""+t+""+i+""+t+"");
        
      }}