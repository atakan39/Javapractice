package tasks_Day21ForEachLoopUtilities;

public class CommonElements {
    public static void main(String[] args) {

      int [] arr1= {1,2,3,4,5};
      int [] arr2= {4,5,6,7,8};


        for (int eachFirst:arr1) {
         int count=0;
            for (int eachSecond:arr2) {
                if(eachFirst==eachSecond){
                    count++;
               }
             }

            if(count==1){
                System.out.print(eachFirst+" ");
            }
        }
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
