package tasks_Day17;

public class MultipilicationTable {
    public static void main(String[] args) {

       String output="* ";

        for (int i = 1; i <11; i++) {

            for (int j = 1; j < 11; j++) {
                System.out.print("\t"+i*j);
            }
            System.out.println();
        }
    }

        }
/*
2. Create a class called RoomReservation, write a program for the room reservation:  while true..
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */