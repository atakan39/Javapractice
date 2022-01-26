package tasks_Day32Constructors;

public class Sport {

    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport(String name, int players, boolean teams){
        name=name;
        numOfPlayers=players;
        teamBased=teams;

    }

    public String toString(){
        String msg=" the sport is "+ name+ " and has "+ numOfPlayers+" players total";
        if(teamBased) {
            msg += "divided into teams";
        }else{
        msg+="but there is no tems";
        }
        return msg;
        }


    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("soccer", 22,true);
        System.out.println(soccer);
    }

    }
