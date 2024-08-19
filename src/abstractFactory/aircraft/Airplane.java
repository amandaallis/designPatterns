package abstractFactory.aircraft;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCarga();
        System.out.println("Iniciando a rota");
    }

    @Override
    public void getCarga() {
        System.out.println("Passageiros abordo, voo autorizado");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25 km/h");
    }
}
