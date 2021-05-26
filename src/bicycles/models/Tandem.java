package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {


     public void accelerate() {
         changeSpeed(12);
     }


     public void brake() {
        changeSpeed(-7);
     }

    public BicycleType getBikeType() {
        return BicycleType.Tandem;
    }
}
