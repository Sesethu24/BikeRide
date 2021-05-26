package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {

    @Test
    public void shouldAddMaxAllowedRides(){

        FunRide funRide =new FunRide(2);
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();

        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);

        assertEquals(funRide.getEnteredCount(),2);
    }

    @Test
    public void shouldCountForEachType(){

        FunRide funRide =new FunRide(6);
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();

       funRide.getCountForType(BicycleType.MountainBike);

        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike),1);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike),1);
        assertEquals(funRide.getCountForType(BicycleType.Tandem),2);
    }
    @Test
    public void shouldCountForRoadBikes(){

       FunRide funRide =new FunRide(6);
       Tandem tandem = new Tandem();
       RoadBike roadBike = new RoadBike();
       MountainBike mountainBike = new MountainBike();

        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);

       funRide.getCountForType(BicycleType.Tandem);
       funRide.getCountForType(BicycleType.RoadBike);
       funRide.getCountForType(BicycleType.MountainBike);

       assertEquals(funRide.getCountForType(BicycleType.RoadBike),3);

    }
    @Test
    public void shouldCountForMountainBikes(){

        FunRide funRide =new FunRide(6);
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();

        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        funRide.getCountForType(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.RoadBike);
        funRide.getCountForType(BicycleType.MountainBike);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike),2);

    }
    @Test
    public void shouldCountForTandem(){

        FunRide funRide =new FunRide(6);
        Tandem tandem = new Tandem();
        RoadBike roadBike = new RoadBike();
        MountainBike mountainBike = new MountainBike();

        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);

        funRide.getCountForType(BicycleType.Tandem);
        funRide.getCountForType(BicycleType.RoadBike);
        funRide.getCountForType(BicycleType.MountainBike);

        assertEquals(funRide.getCountForType(BicycleType.Tandem),1);

    }
}
