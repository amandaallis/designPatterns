package builder.cars;

import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class SportCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public SportCar(CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }
}
