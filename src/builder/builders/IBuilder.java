package builder.builders;

import builder.components.CarType;
import builder.components.Engine;
import builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
