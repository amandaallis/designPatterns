package factory;

import factory.vehicle.Bicycle;
import factory.vehicle.Ivehicle;

public class BycleTransport extends Transport{
    @Override
    protected Ivehicle createTransport() {
        return new Bicycle();
    }
}
