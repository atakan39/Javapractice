package tasks_Day35Encapsulation.cridentialsTask;

public class Cridentials {

    private String userName;
    private String passWord;


    public boolean isStrongPassWord(){
        boolean isValid=passWord.length()>=8 && !passWord.contains(" ");

        int digits=0;
        int letters=0;
        int speacialChars=0;

        for(int i=0; i<passWord.length();i++){
            if(Character.isLetter(passWord.charAt(i))){
                digits++;
            }else if (Character.isDigit(passWord.charAt(i))){
                letters++;
            }else {
                speacialChars++;
            }
        }

        return isValid && digits>0 && letters>0 && speacialChars>0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        boolean isValid=passWord.length()>=8 && !passWord.contains(" ");

        int digits=0;
        int letters=0;
        int speacialChars=0;

        for(int i=0; i<passWord.length();i++){
            if(Character.isLetter(passWord.charAt(i))){
                letters++;
            }else if (Character.isDigit(passWord.charAt(i))){
                digits++;
            }else {
                speacialChars++;
            }
        }

            if (!isValid) {
                System.err.println("password must at least 8 character long or no space includes");
                System.exit(0);
            }
            if (digits==0) {
                System.err.println("password must have digit");
                System.exit(0);
            }
            if (letters == 0) {
                System.err.println("password must have letter");
                System.exit(0);
            }
            if (speacialChars == 0) {
                System.err.println("password must have special character");
                System.exit(0);
            }


    }




    public Cridentials(String userName, String passWord) {
        setUserName(userName);
        setPassWord(passWord);
    }

    public String toString() {
        return "Cridentials{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
/*
@@@ 2. create a class named Credentials
        Variables:
        username, password

        Methods:
        isStrongPassWord(): takes an argument of string and verify if the given string is strong password
        Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one letter
        3. Password should at least contain one special characters
        4. Password should at least contain a digit

        getPassword(): reads the password
        getUsername(): reads the username
        setUsername(): sets the username
        setPassword(): sets a new password
        the new password MUST be a strong password

        toString():

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

 */