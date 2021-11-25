package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride){
            if(rides.size() == 0 || rides.get(rides.size()-1).getDayOfWeek() <= ride.getDayOfWeek()){
                if(rides.size() == 0 ||  rides.get(rides.size()-1).getNumberOfRide() < ride.getNumberOfRide()){
                    rides.add(ride);
                }
                else{
                    throw new IllegalArgumentException("Invalid number of rides");
                }
            }
            else{
                throw new IllegalArgumentException("Invalid value of day");
            }
    }

    public List<Ride> getRides() {
        return rides;
    }
}
