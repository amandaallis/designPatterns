package factory;

import factory.vehicle.Ivehicle;
import factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected Ivehicle createTransport() {
       return new Motorcycle();
    }
}
