package abstractFactory.factories;

import abstractFactory.aquariumVehicle.Boat;
import abstractFactory.aquariumVehicle.IAquarium;

public interface BoatTransport {
    IAquarium createBoat();
}
