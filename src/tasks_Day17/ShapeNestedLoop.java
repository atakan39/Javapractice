package tasks_Day17;

public class ShapeNestedLoop {
    public static void main(String[] args) {
        String output="* ";

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(output);
            }
            System.out.println();
        }
    }
}
