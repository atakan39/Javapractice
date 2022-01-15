package tasks_Day32Constructors;
import java.util.ArrayList;
import java.util.Arrays;

public class Replt {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(numbers);

        ArrayList<Integer>newNumbers=appendPosSum(numbers);


        System.out.println(newNumbers);



    }

    public static String clean (String text , String badWord) {


        String result="";
        if(text.contains(badWord)){     // " two"
            result+=text.replace(" "+badWord,"");
        }

        return result;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0; // 0 1 2 3 4 " "
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    public static ArrayList appendPosSum(ArrayList<Integer>list){
        ArrayList<Integer>newList=new ArrayList<>();

        list.removeIf(p->p<=0);

        int sum=0;
        for(int each: list){
            newList.add(each);
            sum+=each;
        }
        newList.add(sum);

        return newList;
    }




}
