package abstractFactory.factories;

import abstractFactory.aquariumVehicle.Boat;
import abstractFactory.aquariumVehicle.IAquarium;

public class BoatsTransport implements BoatTransport{

    @Override
    public IAquarium createBoat() {
        return new Boat();
    }
}
