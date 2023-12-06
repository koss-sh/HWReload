package hw2_3;

public class ServiceStation {

    public void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }


    public void check(Car car) {
        if (car != null) {
            checkVehicle(car);
            car.checkEngine();
        }
   }

    public void check(Truck truck) {
        if (truck != null) {
            checkVehicle(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            checkVehicle(bicycle);
        }
    }
}
