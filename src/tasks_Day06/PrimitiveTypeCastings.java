package tasks_Day06;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        byte a = 100;        int x =2000;
        short b = a;         long y =(int)x;

        System.out.println(a +" : "+b);

        int c = b;

        System.out.println(c);

        short d = (short)c;

        System.out.println(d);

        double m = 30.5;
        float k = (float)m;

        System.out.println(k);

        byte f = 10;
        int g = f;

        short h = (short)g;

        short w = 20;
        double z = w;

        int o = (int)z;

        System.out.println(z);
        System.out.println(o);




        System.out.println(f +" "+ g + " " +h  );


        short t = 40;
        long v = t;

        System.out.println(v);












    }

}
