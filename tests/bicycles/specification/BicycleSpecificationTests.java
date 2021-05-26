package bicycles.specification;

import bicycles.*;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTests {

//bike ride one tests below
@Test
public void shouldAccelerateAndBrake(){
    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
    Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

    BikeRide rBikeRide = new BikeRideOne(roadBike);
    rBikeRide.ride(roadBike);
    assertEquals(roadBike.currentSpeed(),66);
}
@Test
    public void shouldAccelerateAndBreakUsingMountainBike(){

    BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
    Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

    BikeRide mBikeRide = new BikeRideOne(mountainBike);
    mBikeRide.ride(mountainBike);
    assertEquals(mountainBike.currentSpeed(),30);
}
    @Test
    public void shouldAccelerateAndBreakUsingTandem(){

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);

        BikeRide tBikeRide = new BikeRideOne(tandem);
        tBikeRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),72);
    }

    //bike ride two tests below
    @Test
    public void shouldAccelerateAndBrakeCorrectly(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BikeRide rBikeRide = new BikeRideTwo(roadBike);
        rBikeRide.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),21);
    }
    @Test
    public void shouldAccelerateAndBreakCorrectlyUsingMountainBike(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),6);
    }
    @Test
    public void shouldAccelerateAndBreakCorrectlyUsingTandem(){

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);

        BikeRide tBikeRide = new BikeRideTwo(tandem);
        tBikeRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),15);
    }
 //Bike Ride Three tests below

    @Test
    public void shouldAccelerateAndBrakeUsingBikeRideThree(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);

        BikeRide rBikeRide = new BikeRideThree(roadBike);
        rBikeRide.ride(roadBike);
        assertEquals(roadBike.currentSpeed(),10);
    }
    @Test
    public void shouldAccelerateAndBreakUsingMountainBikeUsingBikeRideThree(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BikeRide mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(),1);
    }
    @Test
    public void shouldAccelerateAndBreakUsingTandemUsingBikeRideThree(){

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(tandemBikeSpec);

        BikeRide tBikeRide = new BikeRideThree(tandem);
        tBikeRide.ride(tandem);
        assertEquals(tandem.currentSpeed(),3);
    }

}
