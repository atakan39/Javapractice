package tasks_Day37Inheritance.sportTask;

public class Fotomac {
    public static void main(String[] args) {

        AmericanFootball americanFootball=new AmericanFootball(26,5,"A");

        Football football= new Football(22,3,"B");

        Baseball baseball=new Baseball(15,7,"C");

        Basketball basketball=new Basketball(10,4,"D");


        System.out.println(americanFootball);
        System.out.println(football);
        System.out.println(baseball);
        System.out.println(basketball);


    }
}
