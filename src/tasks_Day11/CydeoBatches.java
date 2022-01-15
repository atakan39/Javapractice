package tasks_Day11;

public class CydeoBatches {
    public static void main(String[] args) {
        String batchType = "EU";
        String schdule = "";
        //Nested if statement

        boolean validBatch = batchType == "US morning" || batchType == "US evening" || batchType == "EU";
        if (validBatch) {
            schdule=(batchType == "US morning") ? "Class times are 10-5 EST.\n M, T, Th, F."
                    :(batchType == "US evening") ? "Class times are 7-10 EST. \n M, T, W, Th, S, S"
                    : "Class times are  10-5 EST. \n M, T, W, Th, F.";

        } else {
            schdule="Invalid Batch";
        }
        System.out.println(schdule);

        // switch
        switch (batchType){
            case "US morning":
                schdule="Class times are 10-5 EST.\n M, T, Th, F.";
                break;
            case "US evening":
                schdule="Class times are 7-10 EST. \n M, T, W, Th, S, S";
                break;
            case "EU":
                schdule="Class times are  10-5 EST. \n M, T, W, Th, F.";
                break;
            default:
                schdule="Invalid Batch";

        }
        System.out.println(schdule);
     //IF switch mix
        if (validBatch) {
            switch (batchType){
                case "US morning":
                    schdule="Class times are 10-5 EST.\n M, T, Th, F.";
                    break;
                case "US evening":
                    schdule="Class times are 7-10 EST. \n M, T, W, Th, S, S";
                    break;
                default:
                    schdule="Class times are  10-5 EST. \n M, T, W, Th, F.";
                    break;}
        } else {
            schdule="Invalid Batch";
        }
        System.out.println(schdule);
    }
}
/*
@@@	4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

   @     	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
   @     	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
   @     	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
	@		 	Solution 1: use if statement
	@			Solution 2: use switch statement
	@			Solution 2: use if & switch statements mixed

 */





