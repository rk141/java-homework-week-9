package hwweek_9;

import java.util.ArrayList;

public class IsEmpty {

    public static void isempty() {

        ArrayList ugname = new ArrayList();

        ugname.add("Bakerloo");
        ugname.add("Central");
        ugname.add("Circle");
        ugname.add("District");
        ugname.add("Hammersmith");
        ugname.add("Piccadilly");
        ugname.add("Victoria");
        ugname.add("Northern");

        if (ugname.isEmpty()){
            System.out.println("Underground name is empty");
        }else {
            System.out.println("Underground name is not empty");
        }
    }

    public static void main(String[] args) {
        isempty();
    }
}
