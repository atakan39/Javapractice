package tasks_Day17;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        String anotherOne = "";
        do {
            String kingSize = "You reserved a King size room , total:120$";
            String quennSize = "You reserved a Queen size room , total:100$";
            String singleSize = "You reserved a Single size room, total:80$";

            System.out.println("Do you need a room?");
            String needRoom = inPut.next().toLowerCase();

            while (!(needRoom.equals("yes") || needRoom.equals("no"))) {
                System.out.println("please re-enter your answer");
                needRoom = inPut.next().toLowerCase();
            }
            if (needRoom.equals("no")) {
                System.out.println("hava a good day");
            } else {
                System.out.println("which thype of room you would like?" +
                        "\nfor 120$ King size room, enter (K)" +
                        "\nfor 100$ King size room, enter (Q)" +
                        "\nfor 80$ King size room, enter (S)");
                char roomType = inPut.next().charAt(0);
                boolean validEntry = roomType == 'Q' || roomType == 'q' || roomType == 'K' || roomType == 'k' || roomType == 'S' || roomType == 's';

                while (!validEntry) {
                    System.err.println("please enter valid character? K/Q/S");
                    roomType = inPut.next().charAt(0);
                }
                switch (roomType) {
                    case 'K':
                    case 'k':
                        System.out.println(kingSize);
                        break;
                    case 'Q':
                    case 'q':
                        System.out.println(quennSize);
                        break;
                    case 'S':
                    case 's':
                        System.out.println(singleSize);
                        break;
                    default:
                }

                System.out.println("would u like con?");
                anotherOne = inPut.next().toLowerCase();






         /*   if(roomType=='Q'||roomType=='q'){
                System.out.println(quennSize);
            }else if(roomType=='K'||roomType=='k'){
                System.out.println(kingSize);
            }else if{
                System.out.println(singleSize);
            }*/

            }

        }while (anotherOne.equals("yes"));

        inPut.close();
    }
}
/*
5. Create a class called RommReservation,
 write a program for the room reservation, your program asks the user wants to reserve a room.
        if user entered yes, then ask which type of room the user wants to reserve.
           if user entered no, print "have a nice day"
        (if user entered any invalid answer (other than yes/no)
        ask user to reenter until user provides a valid entry)

        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        the program should be able to display the room
        he/she reserved and total price of the room.

        (if the user selected an invalid room, ask the user to
         reselect the room until user provides a valid entry)


 */