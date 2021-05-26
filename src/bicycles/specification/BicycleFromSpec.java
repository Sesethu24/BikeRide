package bicycles.specification;


import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

   private final BicycleSpecification specs;

     public BicycleFromSpec(BicycleSpecification specs) {
         this.specs = specs;
     }

     public void accelerate() {
       changeSpeed(this.specs.getAccelerationSpeed());
     }

     public void brake() {
      changeSpeed(this.specs.getBrakeSpeed());
     }


     public BicycleType getBikeType() {
         return this.specs.getBicycleType();
     }

     public int getCurrent(){
         return currentSpeed();
     }
 }
