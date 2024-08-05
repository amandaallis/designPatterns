package factory.vehicle;

public class Motorcycle implements Ivehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCarga() {
        System.out.println("Já pegamos a encomenda");
    }
}
