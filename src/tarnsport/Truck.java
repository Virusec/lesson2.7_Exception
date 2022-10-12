package tarnsport;

public class Truck extends Transport implements Competing {

    private TypeOfWeight typeOfWeight;

    public Truck(String brand, String model, double engineVolume, TypeOfWeight typeOfWeight) {
        super(brand, model, engineVolume);
        this.typeOfWeight = typeOfWeight;
    }

    public TypeOfWeight getTypeOfLoadCapacity() {
        return typeOfWeight;
    }

    public void setTypeOfLoadCapacity(TypeOfWeight typeOfWeight) {
        this.typeOfWeight = typeOfWeight;
    }

    @Override
    public void startMoving() {
        System.out.println("Ходу.");
    }

    @Override
    public void finishMoving() {
        System.out.println("По тормозам.");
    }

    @Override
    public void doPitStop() {
        System.out.println("Смени резину.");
    }

    @Override
    public void doBestLapTime() {
        System.out.println("Сделай лучшее время " + getBrand() + " " + getClass());
    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Сделай максимальную скорость.");
    }

    @Override
    public void determineType() {
        if (typeOfWeight == null) {
            System.out.println("Данных недостаточно.");
        } else {
            System.out.println("Грузоподъемность - " + typeOfWeight.getDescription());
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.6;
    }
}
