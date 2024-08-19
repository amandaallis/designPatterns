package abstractFactory.factories;

import abstractFactory.aircraft.Helicopter;
import abstractFactory.aircraft.IAircraft;
import abstractFactory.landVehicle.IlandVehicle;
import abstractFactory.landVehicle.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public IlandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportIaircraft() {
        return new Helicopter();
    }
}
