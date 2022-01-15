package tasks_Day31Constructors;

import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie=new Movie("Usa","Drama of Life","Adventure, Real Life Story, Drama","10/25/2021","Atakan");

        String[]casts={"Emre","Ali","Sidar"};

        movie.addCast("Kamil");
        movie.addCasts(casts);

        System.out.println(">>>"+movie.title+"<<<");
        System.out.println(movie);
        System.out.println("Casts"+movie.casts);
        System.out.println(movie.genre +" \n\t\tDirector: "+ movie.diretor);



    }
}
