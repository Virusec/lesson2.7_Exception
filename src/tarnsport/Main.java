package tarnsport;

public class Main {

    public static void main(String[] args) {
        Bus aeroTown = new Bus("Hyundai", "Aero Town", 3.1, TypeOfCapacity.ESPECIALLY_BIG);
        Bus aurora = new Bus("ПАЗ", "Аврора", 2.8, TypeOfCapacity.MIDDLE);
        Bus crafter = new Bus("Volkswagen", "Crafter", 3.2);
        Bus sprinter = new Bus("Mercedes-Benz", "Sprinter", 3.5, TypeOfCapacity.ESPECIALLY_SMALL);

        Car lada = new Car("Lada", "Kalina", 1.6, TypeOfBody.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, TypeOfBody.STATION_WAGON);
        Car bmw = new Car("BMW", "Z8", 2.5, TypeOfBody.COUPE);
        Car hyundai = new Car("Hyundai", "Avante", 1.8, TypeOfBody.SEDAN);

        Truck fighter = new Truck("Mitsubishi", "Fighter", 8.2, TypeOfWeight.N2);
        Truck bichok = new Truck("ЗИЛ", "5301 Бычок", 4.0, TypeOfWeight.N3);
        Truck vario = new Truck("Mercedes-Benz", "Vario", 4.2, TypeOfWeight.N1);
        Truck tgl = new Truck("MAN", "TGL", 6.7, TypeOfWeight.N1);

        aeroTown.printInfo();
        tgl.doBestLapTime();

        Driver<Bus> kostya = new Driver<>("Kostya Minin", "D", 6, crafter);
        kostya.startMoving(aurora);

        Driver<Car> andrei = new Driver<>("Andrei Ivanov", "B", 4, audi);
        andrei.startMoving(bmw);

        Driver<Truck> mihail = new Driver<>("Mihail Kotov", "C", 8, vario);
        mihail.refuel(fighter);

        printInfoRace(andrei);


        lada.setTypeOfBody(TypeOfBody.HATCHBACK);
        crafter.determineType();
        sprinter.determineType();
        hyundai.determineType();
        bichok.determineType();

        service(aeroTown, aurora, crafter, sprinter,
                lada, audi, bmw, hyundai,
                fighter, bichok, vario, tgl);
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            service(transport);
        }
    }

    private static void service(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Транспорт " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику.");
            } else {
                System.out.println("Транспорт " + transport.getBrand() + " " + transport.getModel() + " успешно прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printInfoRace(Driver<? extends Transport> drivers) {
        System.out.println("Водитель " + drivers.getName()
                + " управляет автомобилем " + drivers.getTransport().getBrand() + drivers.getTransport().getModel()
                + " и будет участвовать в заезде.");
    }
}