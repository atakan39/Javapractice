package tasks_Day11;

public class NumberOfMonth {
    public static void main(String[] args) {
        int date = 8; // 1~12
        String month;
        switch(date) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "april";
                break;
            case 5:
                month = "may";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "Aug";
                break;
            case 9:
                month = "Sep";
                break;
            case 10:
                month = "Oct";
                break;
            case 11:
                month = "Nov";
                break;
            case 12:
                month = "dec";
                break;
            default:
                month = "Invalid Entry";
        }


                System.out.println(month);

    }
}
