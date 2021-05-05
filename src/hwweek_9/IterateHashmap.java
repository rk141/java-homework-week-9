package hwweek_9;

import java.util.HashMap;
import java.util.Map;

public class IterateHashmap {

    public void hashMap() {

        Map<String, Integer> people = new HashMap<>();
        people.put("Ramesh",75);
        people.put("Jay", 68);
        people.put("Dipak",85);
        people.put("Viral",35);
        people.put("Nidhi",28);
        people.put("Jalpa",36);
        people.put("Krupa",19);

        for(Object value : people.values()){

            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        IterateHashmap map = new IterateHashmap();
        map.hashMap();
    }
}
