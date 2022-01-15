package tasks_Day26CustomMethodsPractice;

public class FrequencyOfWord {
    public static void main(String[] args) {

       String str = "Java java java python python" ;
        String word = "java";

        System.out.println(frequencyOfWord(str,word));

    }

    public static int frequencyOfWord(String sentence,String word){


        int count=0;
        for (int i = 0; i < sentence.length()-word.length(); i++) {

            if(sentence.substring(i,i+4).equalsIgnoreCase(word)){
                count++;
            }

        }
        return count;
    }


}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */