class array{
    public static void main(String[] args) {

        String[] car= {"mcalaren","BMW"};
        int[] num= {1,2,23};
        float[] fighterjet={12.2f,133.2f,312.21f};

        
        //accesing data from above array
        System.out.println(car[1]);
        System.out.println(num[0]);
        System.out.println(fighterjet[2]);

        //to display all content of array using loops
        for(int i=0;i<car.length;i++){
            System.out.print(car[i]+"\n");
        }

       for(int j=0;j<fighterjet.length;j++){
            System.out.println(fighterjet[j]);
        }
    }
}