package tasks_Day37Inheritance.sportTask;

public class Sport {

    public String name;
    public int numberOfPlayers;
    public int numberOfReferee;
    public String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void play(){
        System.out.println("you can play"+name+"with "+numberOfPlayers+"players");
    }

}
