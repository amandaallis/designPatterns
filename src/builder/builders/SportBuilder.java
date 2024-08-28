package builder.builders;

import builder.cars.SportCar;
import builder.cars.Truck;
import builder.components.CarType;
import builder.components.Color;
import builder.components.Engine;
import builder.components.Transmission;

public class SportBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Color color;
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public SportCar getResult() {
        return new SportCar(carType, seats, engine, transmission, color);
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }
}
