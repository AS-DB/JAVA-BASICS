class Control_statement_Switch{
    public static void main(String args[]){
        String g="Aditya das";
        int q=12;
        char k='r';
        switch(g){
            case "ADitya das": System.out.print("Hello"+g); break;
            
            case "Aditya das": System.out.print("Hello"+g); break;
            
            case "ADity": System.out.print("Hello"+g); break;

        }

        switch(q){
            case 1: System.out.print("Hello"+g); break;
            
            case 12: System.out.print("Hello"+g); break;
            
            case 13: System.out.print("Hello"+g); break;

        }

        switch(k){
            case 'r': System.out.print("Hello"+g); break;
            
            case 'a': System.out.print("Hello"+g); break;
            
            case 't': System.out.print("Hello"+g); break;

        }
    }
}