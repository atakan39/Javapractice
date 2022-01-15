package tasks_Day08_09;

public class ChooseLanguage {
    public static void main(String[] args) {
        int n =3;

        String language = (n == 1) ? "Hello, thank for your call"
                : (n == 2) ? "Hola, gracias para llamar"
                : (n == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                : (n == 4) ? "Privet, spasibo za vash zvonok"
                : (n == 5) ? "Merci ,pour votre appel"
                : "Invalid entry";
        System.out.println(language);
    }
}
/*
Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */
