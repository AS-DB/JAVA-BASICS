class AgeRestriction extends Exception{
    int age;
    AgeRestriction(int age){
        this.age=age;
        System.out.println(age+"\tis not possible for vote!");
    }
}
class User_ExceptionMain{
    public static void main(String[] args) {
        int age=10;
        
        try{
        if (age<18 || age>100){
            throw new AgeRestriction(age);
        }
    }

    catch(AgeRestriction e){}
    }
}