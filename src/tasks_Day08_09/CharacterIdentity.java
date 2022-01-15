package tasks_Day08_09;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '5';
    String result = "";

        if(ch >= '0' && ch <= '9'){
        result = "Digit";
    }else if( (ch >= 'A' && ch <= 'Z' )  || (ch >= 'a' && ch <= 'z')  ){
        result = "Alphabetic";
    }else{
        result = "Special Character";
    }
        System.out.println(result);


        /* char ch = 65;

            if(ch >= 48 && ch <= 57) {
                System.out.println("Digit");
            }else if( (ch >= 65 && ch <= 90)  || (ch >= 97 && ch <= 122)  ) {
                System.out.println("Alphabetic");
            }else {
                System.out.println("Special character");
            }*/
}
}