package tasks_Day11;

public class BrowserSwitch {
    public static void main(String[] args) {
        String Browser="safawri";
        String outPut="";

        switch (Browser){
            case "chrome": case"firefox": case"opera": case"safari": case"edge":
                outPut="valid";
                break;
                default: outPut="Invalid Browser";
        }
        System.out.println(outPut);
    }
}
/*
@@@	3.  write a program that can display the selected browser
   @         3.1  declear a String variable called browserName
    @        3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
     @       3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */
