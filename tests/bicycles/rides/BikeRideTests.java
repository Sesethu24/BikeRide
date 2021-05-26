package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTests {

    /* bikeRideOne tests */

    @Test
    public void bikeRideOneShouldUseMountainBikeToAccelerate() {

        MountainBike mountainBike = new MountainBike();

        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);
        bikeRideOne.ride(mountainBike);
        assertEquals(30, bikeRideOne.currentSpeed());

    }
    @Test
    public void bikeRideOneShouldUseRoadBikeToAccelerate() {

        RoadBike roadBike = new RoadBike();

        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);
        bikeRideOne.ride(roadBike);
        assertEquals(66, bikeRideOne.currentSpeed());

    }
    @Test
    public void bikeRideOneShouldUseTandemBikeToAccelerate() {

        Tandem tandem = new Tandem();

        BikeRideOne bikeRideOne = new BikeRideOne(tandem);
        bikeRideOne.ride(tandem);
        assertEquals(72, bikeRideOne.currentSpeed());

    }

    //bikeRideTwo tests below
    @Test
    public void bikeRideTwoShouldUseRoadBikeAccelerateAndBrakeCorrect() {

        RoadBike roadBike = new RoadBike();

        BikeRideTwo bikeRideTwo = new BikeRideTwo(roadBike);
        bikeRideTwo.ride(roadBike);
        assertEquals(21, bikeRideTwo.currentSpeed());

    }
    @Test
    public void bikeRideTwoShouldUseTandemAccelerateAndBrakeCorrect() {

        Tandem tandem = new Tandem();

        BikeRideTwo bikeRideTwo = new BikeRideTwo(tandem);
        bikeRideTwo.ride(tandem);
        assertEquals(15, bikeRideTwo.currentSpeed());

    }
    @Test
    public void bikeRideTwoShouldUseMountainBikeAccelerateAndBrakeCorrect() {

        MountainBike mountainBike = new MountainBike();

        BikeRideTwo bikeRideTwo = new BikeRideTwo(mountainBike);
        bikeRideTwo.ride(mountainBike);
        assertEquals(6, bikeRideTwo.currentSpeed());

    }
     //bikeRideThree tests below
    @Test
    public void bikeRideThreeShouldBeAbleToSlowDownWithTandem() {

        Tandem tandem = new Tandem();

        BikeRideThree bikeRideThree = new BikeRideThree(tandem);
        bikeRideThree.ride(tandem);
        assertEquals(3, bikeRideThree.currentSpeed());

    }
    @Test
    public void bikeRideThreeShouldBeAbleToSlowDownWithRoadBike() {

        RoadBike roadBike = new RoadBike();

        BikeRideThree bikeRideThree = new BikeRideThree(roadBike);
        bikeRideThree.ride(roadBike);
        assertEquals(10, bikeRideThree.currentSpeed());

    }
    @Test
    public void bikeRideThreeShouldBeAbleToSlowDownWithMountainBike() {

        MountainBike mountainBike = new MountainBike();

        BikeRideThree bikeRideThree = new BikeRideThree(mountainBike);
        bikeRideThree.ride(mountainBike);
        assertEquals(1, bikeRideThree.currentSpeed());

    }

}
