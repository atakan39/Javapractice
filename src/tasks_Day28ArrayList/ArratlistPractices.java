package tasks_Day28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArratlistPractices {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));

        changelastZero(numbers);

        System.out.println(numbers);

        numbers.set(numbers.size()-1, 5);

        ArrayList<Integer>reversed=new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
           reversed.add(numbers.get(i));
        }

        System.out.println(reversed);    // reversed with for loop

        Collections.reverse(numbers);

        System.out.println(numbers);  //reversed with collection utility

        Collections.reverse(numbers);

        int i=0;                                  // multiply *2 to Oddnumbers
        for (Integer each : numbers) {
            if(each%2!=0){
                numbers.set(i,each*2);
            }
         i++;
        }

        System.out.println(numbers);

        Integer max=numbers.get(0);
        Integer min=numbers.get(0);
        for (Integer number : numbers) {
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }

   //        int max2=Collections.max(numbers);    find max by collection utility;


        System.out.println(max);
        System.out.println(min);

        ArrayList<Integer>numberList=new ArrayList<>();
        numberList.addAll(Arrays.asList(1,3,4,4,4,5,5,5));

        findFirstDuplicate(numberList);



    }

    public static ArrayList changelastZero(ArrayList list){
        list.set(list.size()-1,0);




        return list;
    }

    public static void findFirstDuplicate(ArrayList list){

        for (Object o : list) {
            int freq=0;
            for (Object o1 : list) {
                if(o1==o){
                    freq++;
                }
            }

            if(freq>1){
                System.out.println("First Duplicated element is "+o);
                break;
            }
        }

    }
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
    Ex:
    list = [1,2,2,3,4,4,5,6,7,7];
    output:
            2
            */




}
/*
1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];

        2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5


6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1

 */