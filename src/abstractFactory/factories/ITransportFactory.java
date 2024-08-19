package abstractFactory.factories;

import abstractFactory.aircraft.IAircraft;
import abstractFactory.landVehicle.IlandVehicle;

public interface ITransportFactory {
    IlandVehicle createTransportVehicle();
    IAircraft createTransportIaircraft();

}
