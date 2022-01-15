package tasks_Day11;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber=5;
        String message="";
        // nested if solution 1
        if(floorNumber>=1&&floorNumber<=3){
            message=(floorNumber==1)?"Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
                    :(floorNumber==2)?"Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
                    : "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        }else{
            message="Invalid floor - "+floorNumber;
        }
        System.out.println(message);
     // only with switch solution 2
        switch (floorNumber){
            case 1:
                message="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                message="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                message="Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                message="Invalid floor - "+floorNumber;

        }
        System.out.println(message);

        // solution 3 if & switch mix
        if(floorNumber>=1&&floorNumber<=3){

            switch (floorNumber){
                case 1:
                    message="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    message="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    message="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else{
            message="Invalid floor - "+floorNumber;
        }

        System.out.println(message);

    }
}
/*
@@@	2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
	@		 	Solution 1: use nested if statement
	@			Solution 2: use switch statement
	@			Solution 2: use if & switch statements mixed

 */
