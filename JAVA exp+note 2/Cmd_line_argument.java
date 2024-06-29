//This program is only executed in cmd
class Cmd_line_argument {
    
    public static void main(String[] args) {
        System.out.println("args[0] value="+args[0]);
        System.out.println("args[1] value="+args[1]);
        System.out.println("args[2] value="+args[2]);

        int i1 = Integer.parseInt(args[1]);
        double i2 = Double.parseDouble (args[2]);

        System.out.println("\n\n\nYour name is "+args[0]);
        System.out.println("Your age is "+i1);
        System.out.println("Your salary is "+i2);


       
        
    }
}
