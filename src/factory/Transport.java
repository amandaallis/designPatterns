package factory;

import factory.vehicle.Ivehicle;

public abstract class Transport {
    public void startTransport() {
        System.out.println("Quero ver se vai aparecer");
        Ivehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract Ivehicle createTransport();
}
