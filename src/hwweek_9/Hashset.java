package hwweek_9;

import java.util.HashSet;

// Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)

public class Hashset {

    public static void hashset(){

        HashSet<Integer> num = new HashSet<Integer>(); // hashmap object created

        // add 4,7,8 to the set
        num.add(4);
        num.add(7);
        num.add(8);

        for(int i =1; i<=10; i++){
            if(num.contains(i)){
                System.out.println(i+ " Found in set");
            }else {
                System.out.println(i+ " Not found in set");
            }
        }
    }

    public static void main(String[] args) {
        hashset();
    }
}
