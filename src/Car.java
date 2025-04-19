
class Engine{
    void start(){
        System.out.println("Engine is started");

    }
}



class Cars {
    private Engine engine;

    public Cars() {
        engine = new Engine();
    }


    public void drive() {
        engine.start();
        System.out.println("Car is moving");

        breaked brakes = new breaked();
        brakes.stop();

    }



    class breaked {
        void stop() {
            System.out.println("Car is stopped");
        }
    }

}


public class Car {
    public static void main(String[] args) {
        Cars Car=new Cars();
        Car.drive();

    }
}
