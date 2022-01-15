package tasks_Day23CustomMethods;

public class DisplayNameOfMonth {
    public static void main(String[] args) {

        displayMonth(5);

        displayNameOfDay(5);

        daysInMonth(5);

    }

    public static void displayMonth(int number){
        String month="";
        switch (number){
            case 1: month="jan";
                break;
            case 2: month="feb";
                break;
            case 3: month="mar";
                break;
            case 4: month="apr";
                break;
            case 5: month="may";
                break;
            case 6: month="jun";
                break;
            case 7: month="jul";
                break;
            case 8: month="aug";
                break;
            case 9: month="sep";
                break;
            case 10: month="oct";
                break;
            case 11: month="now";
                break;
            case 12: month="dec";
                break;
            default:month="invalid Entry";


        }
        System.out.println("month = " + month);;

    }

    public static void displayNameOfDay(int number){

        String day=(number==1)?"monday":(number==2)?"tuesday":(number==3)?"Wednesday":(number==4)?"thursday":(number==5)?"Friday":(number==6)?"Saturday":(number==7)?"Sunday":"invalid entry";
        System.out.println("day = " + day);;
    }

    public static void daysInMonth(int number){

        String totalDays;
            if (number>=1 && number<=12){
                totalDays =(number==2)?"28 Days":(number==4||number==6 || number == 9||number==11)? "30 days": "31 Days";
            }else {
                totalDays="Invalid Entry";
            }
            System.out.println("totalDays of month "+number+" = " + totalDays);
        }

}
/*
3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has


 */
