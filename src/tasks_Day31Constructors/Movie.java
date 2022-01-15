package tasks_Day31Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title,genre,releaseDate,diretor;
    public ArrayList<String>casts=new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String diretor) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.diretor = diretor;
    }

    public void addCasts(String[] array){
        casts.addAll(Arrays.asList(array));
    }
    public void addCast(String name){
       casts.add(name);
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", Total number of casts ='" + casts.size() + '\'' +
                '}';
    }


}
