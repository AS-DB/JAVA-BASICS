class Printf{
    public static void main(String[] args) {
        int i=21;
        
        System.out.printf("\nyour age is:",i);

        System.out.printf("\nyour age is %+d",21);

        System.out.printf("\nyour salary is %.3f",23123.123d);

        System.out.printf("\nyour salary is %,f",23123.123d);

        //width or limiting the string
        String Name = "ADITYADAS IS BRAVE BRO";
        System.out.printf("\nhello %.10S",Name);

        //
    }
}