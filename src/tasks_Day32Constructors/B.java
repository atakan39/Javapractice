package tasks_Day32Constructors;

public class B {

    static int count;

    public B(){
        count++;
    }
    public B(int i){
        count+=i;
    }
    public void B(String s){
        count += s.length();
    }
}

class Test{
    public static void main(String[] args) {
        new B();
        B a= new B();
        B a2= new B(4);
        B a3= new B(5);
        System.out.print(B.count);
    }
}
