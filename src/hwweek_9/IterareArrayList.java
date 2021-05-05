package hwweek_9;

import java.util.ArrayList;
import java.util.Iterator;

public class IterareArrayList {

    public void iterator() {

        ArrayList<Integer> it = new ArrayList<>();

        it.add(10);
        it.add(20);
        it.add(30);
        it.add(40);
        it.add(50);
        Iterator<Integer> i = it.iterator();

        // iterator while
        while (i.hasNext()){
            System.out.println(i.next());
        }
        // iterator for
        for (Object value : it) {
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        IterareArrayList obj = new IterareArrayList();
        obj.iterator();
    }
}
