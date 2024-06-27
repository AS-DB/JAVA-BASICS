class array2d {
    public static void main(String[] args) {

        //direct intialization

        String[][] car={{"camero","BMW","ferrari"},
                        {"supra","tesla","audi"},
                        {"mustang","Lamborgini","porshe"}
                    };

            for(int i=0;i<car.length;i++){
                System.out.println();
                for(int j=0;j<car[i].length;j++){
                    System.out.print(car[i][j]+"\t");
                }
            }
        //dynammic allocation
        

        String[][] car01 = new String[3][3];
        car01[0][0] = "camero";
        car01[0][1] = "BMW";
        car01[0][2] = "ferrari";
        car01[1][0] = "supra";
        car01[1][1] = "tesla";
        car01[1][2] = "audi";
        car01[2][0] = "mustang";
        car01[2][1] = "Lamborghini";
        car01[2][2] = "porsche";

        for(int i=0;i<car01.length;i++){
            System.out.println();
            for(int j=0;j<car[i].length;j++){
                System.out.print(car01[i][j]+"\t");
            }
        }

}
}
