package bicycles;




    public abstract class BicycleBase implements Bicycle{

        private int speed;

        protected int changeSpeed(int speedChanger){
            return speed += speedChanger;
        }

        public int currentSpeed() {
            return speed;
        }

        public void stop() {
            speed = 0;
        }
    }

