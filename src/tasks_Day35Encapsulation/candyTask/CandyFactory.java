package tasks_Day35Encapsulation.candyTask;

import tasks_Day35Encapsulation.pizzaTask.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        ArrayList<Candy> candies=new ArrayList<>();

        Candy candy1=new Candy("koko",3,0,true);
        Candy candy2=new Candy("pokko",3,2,false);
        Candy candy3=new Candy("coco",10,9,true);
        Candy candy4=new Candy("ciko",3,0,false);
        Candy candy5=new Candy("momo",3,5,true);

        System.out.println(candy3);

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy each : candies) {
            if(each.getPrice()==0){
                System.out.println(each.getBrand()+" free");
            }else{
                System.out.println(each.getBrand()+" $"+each.getPrice());
            }


        }

    }
}
