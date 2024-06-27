class String_class{
    public static void main(String[] args) {
        String name="aditya das";
        
        //equal method (totally equal also case sensitive)
        boolean result=name.equals("ADITYADAS");
        System.out.println(result);

        //ignore-eqaul(totally equal not case sensitive)
        boolean result2=name.equalsIgnoreCase("ADITYA");
        System.out.println(result2);

        //lenght of string
        int result3= name.length();
        System.out.println(result3);
        
        //single letter acces from string
        char result4= name.charAt(2);
        System.out.println(result4);

        //return index of characrter in string

        //by default starts from 0
        int result5= name.indexOf('a');
        System.out.println(result5);

        //to start with specific place just add index value from where to start
        
        int result6= name.indexOf('a',3);
        System.out.println(result6);

        //to check whethere is empty
        boolean result7= name.isEmpty();
        System.out.println(result7);

        //to convert into uppercase
        String result8= name.toUpperCase();
        System.out.println(result8);

        
        //to convert into lowercase
        String result9= name.toLowerCase();
        System.out.println(result9);

        //trim empty space
        String result10= name.trim();
        System.out.println(result10);

        //replace character
        String result11= name.replace('a', 'd');
        System.out.println(result11);
        

        //replace string
        String result12= name.replaceAll("adi", "adiy");
        System.out.println(result12);

    }
}