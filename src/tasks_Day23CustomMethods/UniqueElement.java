package tasks_Day23CustomMethods;

public class UniqueElement {

    public static void main(String[] args) {

        uniqueElement(new int[]{10,20,10,30});

    }

    public static void uniqueElement(int numbers[]){

        for (int number:numbers) {
            int count=0;
            for (int element:numbers) {
                if(number==element){
                    count++;
                }
            }
            if(count==1){
                System.out.print(number+" ");
            }
        }
    }
}

/*
2. create a method that can display the unique elements of an integer array
 */
