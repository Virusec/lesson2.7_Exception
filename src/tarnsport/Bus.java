package tarnsport;

public class Bus extends Transport implements Competing {
    private TypeOfCapacity typeOfCapacity;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        setTypeOfCapacity(typeOfCapacity);
    }

    public Bus(String brand, String model, double engineVolume, TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineVolume);
        this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Вперед.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение.");
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + getModel() + " диагностика не требуется.");
        return true;
    }

    @Override
    public void doPitStop() {
        System.out.println("Сделай Пит стоп!");
    }

    @Override
    public void doBestLapTime() {
        System.out.println("Лучший круг.");
    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Выжми максимум!");
    }

    @Override
    public void determineType() {
        if (typeOfCapacity == null) {
            System.out.println("Данных недостаточно.");
        } else {
            System.out.println("Вместимость автобуса - " + typeOfCapacity.getDescription());
        }
    }
}
