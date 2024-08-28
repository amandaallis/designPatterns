import builder.builders.CarBuilder;
import builder.builders.SportBuilder;
import builder.builders.TruckBuilder;
import builder.cars.Car;
import builder.cars.Truck;
import builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //Criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedan(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + "produzido com sucesso");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result());

        SportBuilder sportCarBuilder = new SportBuilder();
        director.constructSportCar(builder,"rosa");
        System.out.println("Carro do tipo "+ sportCarBuilder.getCarType());

    }

}