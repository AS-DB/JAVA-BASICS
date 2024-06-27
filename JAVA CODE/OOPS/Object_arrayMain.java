class Object_array{

    String name;
Object_array(String name){
this.name= name;
}

}

class Object_arrayMain{
    public static void main(String[] args) {
      //declaring array size using the class
        Object_array[] s1 = new Object_array[3];
        
        //assigning value
        Object_array food1= new Object_array("pizza");
        Object_array food2= new Object_array("burger");
        Object_array food3= new Object_array("samosa");

        //it can be two way
        //1

        s1[0]= food1;
        s1[1]= food2;
        s1[2]= food3;

        //2
        Object_array[] s2=  {food1,food2,food3};

        //accesing the value
        System.out.println(s1[0]); //it will give address
        System.out.println(s1[0].name); //it will return the value

    }
}