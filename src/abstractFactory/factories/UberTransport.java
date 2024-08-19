package abstractFactory.factories;

import abstractFactory.aircraft.Airplane;
import abstractFactory.aircraft.IAircraft;
import abstractFactory.landVehicle.Car;
import abstractFactory.landVehicle.IlandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public IlandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportIaircraft() {
        return new Airplane();
    }
}
