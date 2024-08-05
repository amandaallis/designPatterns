package factory.vehicle;

public class Bicycle implements Ivehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Iniciando o Delivery ");
    }

    @Override
    public void getCarga() {
        System.out.println("Já pegamos a comida! ");
    }
}
