class logical_operator{
    public static void main(String[] args) {
        int x=20;
        if (x>=20 && x<=10){
            System.out.println(x);
        }
        else if (x==13 || x!=2){
            System.out.println("yo");
        }
        else if(x!=20){
            System.out.println("hi");
        }
        else{
            System.out.println(x+1);
        }
    }
}