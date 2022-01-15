package tasks_Day15;

public class samples {
    public static void main(String[] args) {
        String str="BrO naber brother misin sen ";

        String replace=str.replace("er","ar");
        String replaceFirst=str.replaceFirst("bro","abi");
        String str2="abc\n";
        String repeat=str2.repeat(4);

        boolean empty=str.isEmpty();
        boolean blunk=str.isBlank();

        boolean startW=str.startsWith("A");

        boolean contains=str.toLowerCase().contains("bro");


        System.out.println(repeat);
        System.out.println(empty);
        System.out.println(blunk);
        System.out.println(startW);
        System.out.println(contains);

    }
}
