package tasks_Day28ArrayList;

import java.util.ArrayList;

public class Conbine2Array {
    public static void main(String[] args) {

        int arr[]={1,2,3};

        int arr2[]={4,5,6};

        ArrayList<Integer>list=combineArrays(arr,arr2);

        System.out.println(list);

       String[] array1 = {"A", "B", "C"};
       String[] array2= {"D", "E", "F", "G"};

       ArrayList<String>list2=combineArrays(array1,array2);

        System.out.println(list2);





    }

    public static ArrayList combineArrays(int array[],int []array2){

        ArrayList<Integer>list=new ArrayList<>();

        for (int each:array) {
            list.add(each);
        }
        for (int each:array2){
            list.add(each);
        }

     return list;
    }

    public static ArrayList combineArrays(String array[],String []array2){

        ArrayList<String>list=new ArrayList<>();

        for (String each:array) {
            list.add(each);
        }
        for (String each:array2){
            list.add(each);
        }

        return list;
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */