package factory.vehicle;

public class Car implements Ivehicle {
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("Iniciando o trajeto.");
    }

    @Override
    public void getCarga() {
        System.out.print("Pegamos os passageiros. Estamos prontos! ");
    }
}
