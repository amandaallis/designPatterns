package abstractFactory.landVehicle;

public class Car implements IlandVehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCarga() {
        System.out.println("Pegamos os passageiros. Estamos prontos. ");
    }
}
