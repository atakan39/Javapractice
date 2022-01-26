package tasks_Day32Constructors;

import java.util.ArrayList;

public class Bed {
    String size;
    ArrayList<Pillow> pillows=new ArrayList<>();

    public Bed(String size, int numOfpillows){
        this.size=size;
        for(int i=0; i<numOfpillows; i++){
            this.pillows.add(new Pillow());
        }
    }
}

class Pillow{
    String material;

    public static void main(String[] args) {
        Bed bed=new Bed("king",4);
        System.out.print(bed.pillows.size());
    }
}
