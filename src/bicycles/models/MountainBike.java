package bicycles.models;


import bicycles.BicycleBase;
import bicycles.BicycleType;

public class MountainBike extends BicycleBase {

    public void accelerate() {
        changeSpeed(5);
    }
    public void brake() {
        changeSpeed(-3);
    }


    public BicycleType getBikeType() {
        return BicycleType.MountainBike;
    }

}