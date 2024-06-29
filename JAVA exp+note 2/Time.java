import java.util.Scanner;

class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        
  
    }
}
