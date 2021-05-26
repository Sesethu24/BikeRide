package bicycles.rides;


import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {

    public Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }

        public void ride(Bicycle bicycle) {
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
            this.bicycle.brake();
        }
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
