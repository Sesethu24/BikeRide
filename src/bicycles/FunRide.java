package bicycles;

import java.util.ArrayList;

public class FunRide {

    int maxBikes;

    public ArrayList<Bicycle> bikes = new ArrayList<>();

    public FunRide(int max) {
        this.maxBikes = max;
    }

    public void accept (Bicycle bicycle){

        if (bikes.size() >= maxBikes) {
            System.out.println("You have exceeded the limit for allowed bikes");
            }

        else {
            bikes.add(bicycle);
            System.out.println("bike added successfully!");
        }
    }

    public int getCountForType(BicycleType bikeType) {
        int counter = 0;
        for (Bicycle bike : bikes) {
            if (bikeType.equals(bike.getBikeType())) {
                counter++;
            }
        }
        return counter;
    }

    public int getEnteredCount() {
        return bikes.size();
    }
}