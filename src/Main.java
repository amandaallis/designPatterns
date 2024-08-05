import factory.BycleTransport;
import factory.CarTransport;
import factory.MotorcycleTransport;
import factory.Transport;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;

            case "moto":
                transport = new MotorcycleTransport();
                break;

            case "eats":
                transport = new BycleTransport();
                break;


            default:
            System.out.println("Escolha o tipo da entrega");

        }
    }
}