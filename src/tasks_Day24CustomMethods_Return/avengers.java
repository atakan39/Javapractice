package tasks_Day24CustomMethods_Return;

public class avengers {
    public static void main(String[] args) {
        String word="rxxedhello";


        if(word.substring(0,3).equals("red")){
            System.out.println(word.substring(0,3));
        }else if(word.substring(0,4).equals("blue")){
            System.out.println(word.substring(0,4));
        }else{
            System.out.println("word not start with blue or red");
        }

    }

}
