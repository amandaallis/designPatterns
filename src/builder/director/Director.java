package builder.director;

import builder.builders.IBuilder;
import builder.builders.SportBuilder;
import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class Director {

    public void constructSedan(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setTransmission(Transmission.manual);
        builder.setSeats(4);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        //TruckBuilder truckBuilder = new TruckBuilder();
        builder.setCarType(CarType.CAMINHAO);
        builder.setTransmission(Transmission.manual);
        builder.setSeats(2);
        builder.setEngine(new Engine(13800));
    }

    public void constructSportCar(IBuilder builder, String color) {
        //SportBuilder builder = new SportBuilder();
        builder.setCarType(CarType.SPORTCAR);
        builder.setTransmission(Transmission.automatic);
        builder.setSeats(2);
        builder.setEngine(new Engine(2000));
        new Color(color);
    }
}
