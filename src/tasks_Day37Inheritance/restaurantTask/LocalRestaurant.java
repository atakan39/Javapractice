package tasks_Day37Inheritance.restaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

    Restaurant location1=new Restaurant("james","NY",4);

    Server server1=new Server("atakan","head server",1,25,true);
        Server server2=new Server("kemal","buser",3,15,false);

    Chef chef1=new Chef("emre","head Chef",2,35,true);
        Chef chef2=new Chef("nuri","salad chef",4,20,true);

    Chef [] chefs={chef1,chef2};
    Server[]servers={server1,server2};

    location1.hireChefs(chefs);
    location1.hireServers(servers);



        System.out.println(Arrays.asList(servers));
        System.out.println(Arrays.asList(chefs));


        System.out.println(location1);

        System.out.println(location1.servers);
        System.out.println(location1.chefs);

        for (Server server : servers) {
            System.out.println(server.jobTitle+", "+server.name+" : "+server.hourlyRate);
        }

        for (Chef chef : chefs) {
            System.out.println(chef.jobTitle+", "+chef.name+" : "+chef.hourlyRate);
        }






    }
}
