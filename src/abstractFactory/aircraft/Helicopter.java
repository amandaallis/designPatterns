package abstractFactory.aircraft;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCarga();
        System.out.println("Iniciando a rota");
    }

    @Override
    public void getCarga() {
        System.out.println("Passageiros ok. Ligando helices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km sudeste");
    }
}
