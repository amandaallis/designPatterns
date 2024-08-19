package abstractFactory.landVehicle;

public class Motorcycle implements IlandVehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Estamos inciando a entrega");
    }

    @Override
    public void getCarga() {
        System.out.println("Já pegamos a encomenda");
    }
}
