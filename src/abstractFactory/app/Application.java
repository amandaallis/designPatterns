package abstractFactory.app;

import abstractFactory.aircraft.IAircraft;
import abstractFactory.factories.ITransportFactory;
import abstractFactory.landVehicle.IlandVehicle;

public class Application {
    private IlandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory typeFactory) {
        vehicle = typeFactory.createTransportVehicle();
        aircraft = typeFactory.createTransportIaircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
