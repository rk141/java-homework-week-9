package hwweek_9;

import java.util.Scanner;

public class Underground {

    public void tube(){
        String tube;
        char ch;
        do {
            Scanner map = new Scanner(System.in);
            System.out.println("Please enter the station name : ");
            tube = map.nextLine();

            if(tube.equals("picadilly")){
                System.out.println(" \n Baker loo line \nCircle line \nDistrict line \nHammersmith & city line");
            }else if(tube.equals("bayswater")){
                System.out.println("Circle line \n District line");
            }else if(tube.equals("nottinghillgate")){
                System.out.println("\n Central line \n District line \n Circle line ");
            }else if(tube.equals("high street kensington ")){
                System.out.println(" \n Circle line \n District line");
            }else if(tube.equals("earlscourt")){
                System.out.println("\n District line \n picadilly line");
            }else if(tube.equals("gloucester road")){
                System.out.println("\n Circle line \n District line \n picadilly line");

            }else if(tube.equals("south kensington")){
                System.out.println("\n Circle line \n District line \n picadilly line");
            }else if(tube.equals("knightsbridge")){
                System.out.println("picadilly line");
            }else if (tube.equals("baker street")){
                System.out.println("\n Bakerloo line \n circle line \n Hammersmith & city line \n Jubilee line ");
            }else
                System.out.println("Statio not in zon one ");
            System.out.println("Do you want information for any other stations? y or n");
            ch = map.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');

    }

    public static void main(String[] args) {

        Underground obj = new Underground();
        obj.tube();
    }
}
