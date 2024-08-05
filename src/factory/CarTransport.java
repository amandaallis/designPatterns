package factory;

import factory.vehicle.Car;
import factory.vehicle.Ivehicle;

public class CarTransport extends Transport {
    @Override
    protected Ivehicle createTransport() {
        return new Car();
    }
}
