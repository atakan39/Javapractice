package tasks_Day22MultiDimensionalArray;

import java.util.Arrays;

public class StringMultiArrays {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] arr1d:items) {
            for (String item:arr1d) {
                System.out.print(item+"\t ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        for (String[] arr1d:items) {

            for (int i = arr1d.length - 1; i >= 0; i--) {
                System.out.print(arr1d[i]+"\t ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {

            for (int j = items[i].length - 1; j >= 0; j--) {

                System.out.print(items[i][j]+"\t ");
            }

            System.out.println();
        }
    }
}
/*
@@@ 2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */
