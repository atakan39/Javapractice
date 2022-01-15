package tasks_Day18NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        int kingSize=0;
        int quennSize=0;
        int singleSize=0;
        double kingPrice=0;
        double queenPrice=0;
        double singlePrice=0;
        String needRoom="";
        do{
          System.out.println("which type of room you would like?" +
                  "\nfor 120$ King size room, enter (K)" +
                  "\nfor 100$ King size room, enter (Q)" +
                  "\nfor 80$ King size room, enter (S)");
          char roomType=inPut.next().charAt(0);
          boolean validEntry=roomType=='Q'||roomType=='q'||roomType=='K'||roomType=='k'||roomType=='S'||roomType=='s';

          while(!validEntry){
              System.err.println("please enter valid character? K/Q/S");
              roomType=inPut.next().charAt(0);
          }

          switch (roomType){
                case 'K': case 'k':
                    kingPrice+=120;
                    kingSize++;
                    break;
                case 'Q': case 'q':
                    queenPrice+=100;
                    quennSize++;
                    break;
                case 'S': case 's':
                    singlePrice+=80;
                    singleSize++;
                    break;
                default:
            }

          System.out.println("Would u like to reverse another room?");
          needRoom=inPut.next().toLowerCase();


          while(!(needRoom.equals("yes") || needRoom.equals("no"))){
                System.out.println("Would u like to reverse another room?");
                needRoom=inPut.next().toLowerCase();
            }

             if(needRoom.equals("no")){
                 System.out.println("your total is : $"+(kingPrice+queenPrice+singlePrice) +
                         "\nYour choices :\n"+kingSize+" King beedroom\n"+quennSize+" Quenn beedroom\n"+singleSize+" Single beedroom");
                 break;
             }

      }while(needRoom.equals("yes"));

        inPut.close();
    }
}
