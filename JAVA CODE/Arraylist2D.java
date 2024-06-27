import java.util.ArrayList;
class Arraylist2D{
    public static void main(String[] args) {

        //mainarray list
        ArrayList<ArrayList<String>> shoplist = new ArrayList<ArrayList<String>>();

        ArrayList<String> chocolateList = new ArrayList<String>();
        //adding items
        chocolateList.add("tiktak");
        chocolateList.add("diary milk");

        ArrayList<String> snacks = new ArrayList<String>();
        //adding items
        snacks.add("tiktak");
        snacks.add("diary milk");

        //adding the both arraylist to main array list
        shoplist.add(chocolateList);
        shoplist.add(snacks);

        //showing all arraylist
        System.out.println(shoplist);

        //get from particular datas from 2daaraylist
        System.out.println(shoplist.get(0));

        //get from particular data from particular arraylist from 2daaraylist
        System.out.println(shoplist.get(0).get(0));
    }
}