package hwweek_9;

import java.util.ArrayList;

public class RetrieveElement {

    public void retrive() {

        ArrayList it = new ArrayList();

        it.add(10); //0
        it.add(20); //1
        it.add(30); //2
        it.add(40); //3
        it.add(50); //4

        System.out.println(it.get(3));
        System.out.println(it.get(0));
    }

    public static void main(String[] args) {
        RetrieveElement obj = new RetrieveElement();
        obj.retrive();
    }
}
