package tasks_Day32Constructors;

public class Interview1 {
    public static void main(String[] args) {

        String dna21="ACTGCTTCAGAAAGGTCTTACG";

       String strChars="";   // ATCG
       String output="ACGT";
       String result="";

        String arr[]=dna21.split("");
        String arr2[]=output.split("");

        for (String each:arr) {
            if (!strChars.contains(each))
                strChars+=each;
        }



        for (String each : arr2) {
            int freq=0;
            for (String element : arr) {
                if(each.equals(element)){
                    freq++;
                }
            }
            if(!result.contains(each)){
                result+=each+":"+freq+" ";
            }
        }
        System.out.println(result);
    }
}
