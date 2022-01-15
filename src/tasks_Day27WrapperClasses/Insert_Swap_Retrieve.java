package tasks_Day27WrapperClasses;

import java.util.Arrays;

public class Insert_Swap_Retrieve {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arr = insert(arr, 2, 100);

        System.out.println(Arrays.toString(arr));

        String names[] = {"atakan", "emre", "kemal", "ozgur"};

        names = insert(names, 2, "omer");

        System.out.println(Arrays.toString(names));

         arr=swapElement(arr,2,4);

        System.out.println(Arrays.toString(arr));


        retrieve("Wooden 8Spoon!");


        swapElement(names, 2,4);

        System.out.println(Arrays.toString(names));



    }

    public static int[] insert(int[] array, int index, int newElement) {
        int[] result = new int[array.length + 1];
        int j = 0;

        for (int i = 0; i < index; i++) {
            result[j] = array[i];
            j++;
        }
        result[index] = newElement;

        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[j];
            j++;
        }
        return result;
    }

    public static double[] insert(double[] array, int index, double newElement) {
        double[] result = new double[array.length + 1];
        int j = 0;

        for (int i = 0; i < index; i++) {
            result[j] = array[i];
            j++;
        }
        result[index] = newElement;

        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[j];
            j++;
        }
        return result;
    }

    public static String[] insert(String[] array, int index, String newElement) {
        String[] result = new String[array.length + 1];
        int j = 0;

        for (int i = 0; i < index; i++) {
            result[j] = array[i];
            j++;
        }
        result[index] = newElement;

        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[j];
            j++;
        }
        return result;
    }

    public static char[] insert(char[] array, int index, char newElement) {
        char[] result = new char[array.length + 1];
        int j = 0;

        for (int i = 0; i < index; i++) {
            result[j] = array[i];
            j++;
        }
        result[index] = newElement;

        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[j];
            j++;
        }
        return result;
    }



    public static int[] swapElement(int[] array, int index1, int index2) {
        int temp=array[index1];

        array[index1]=array[index2];
        array[index2]=temp;

        return array;
    }

    public static double[] swapElement(double[] array, int index1, int index2) {
        double temp=array[index1];

        array[index1]=array[index2];
        array[index2]=temp;

        return array;
    }

    public static char[] swapElement(char[] array, int index1, int index2) {
        char temp=array[index1];

        array[index1]=array[index2];
        array[index2]=temp;

        return array;
    }

    public static String[] swapElement(String[] array, int index1, int index2) {
        String temp=array[index1];

        array[index1]=array[index2];
        array[index2]=temp;

        return array;
    }

    public static void retrieve(String str){

        String letters = "";
        String digits ="";
        String specialChars="";

        int countUpper=0;
        int countLower=0;

        str.toCharArray();

        for (char each:str.toCharArray()) {
            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
                if(Character.isUpperCase(each)){
                    countUpper++;
                }else{
                    countLower++;
                }
            }else{
                specialChars+=each;
            }
        }

        boolean isApperianceEqual=countLower==countUpper;

        System.out.println("letters = " +" \"" +letters +"\";");
        System.out.println("digits = " +" \""+ digits+"\";");
        System.out.println("specialChars = " +" \""+ specialChars+"\";");

        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println("is appeariance equal? : "+isApperianceEqual);



    }


}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array


	3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";


	4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */