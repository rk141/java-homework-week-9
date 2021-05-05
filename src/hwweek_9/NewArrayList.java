package hwweek_9;

import java.util.ArrayList;

public class NewArrayList {

    public void colour() {

        ArrayList<String> colourlist = new ArrayList<>();
        // add colour
        colourlist.add("Red");
        colourlist.add("Green");
        colourlist.add("White");
        colourlist.add("Black");
        colourlist.add("Yellow");
        colourlist.add("Grey");

        for (String colour : colourlist){
            System.out.println(colour);
        }
    }

    public static void main(String[] args) {
        NewArrayList obj = new NewArrayList();
        obj.colour();
    }
}
