class Switch_case{
    public static void main(String[] args) {
        String day="Sunday";

        switch (day) {
            case "Sunday":System.out.println("Its sunday");break;
            case "monday":System.out.println("Its monday");break;
            case "tuesday":System.out.println("Its tuesday");break;
            case "wednesday":System.out.println("Its wednesday");break;
            case "thursday":System.out.println("Its thursday");break;
            case "friday":System.out.println("Its friday");break;
            case "saturday":System.out.println("Its saturday");break;
            default: System.out.println("No such day");
        }

        int a=1;
        switch (a) {
            case 1:System.out.println("1");break;
            case 2:System.out.println("2");break;
            default:System.out.println("No match");break;
        }

        char o='a';
        switch(o){
            case 'a':System.out.println("a");break;
            default: System.out.println("Not found");
        }
    }
}