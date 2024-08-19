package abstractFactory.aquariumVehicle;

public class Boat implements IAquarium{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Iniciando a rota");
    }

    @Override
    public void getCarga() {
        System.out.println("Pegamos a carga");
    }

}
