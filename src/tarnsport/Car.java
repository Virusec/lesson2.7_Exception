package tarnsport;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void startMoving() {
        System.out.println("Начинаем движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Остановиться.");
    }

    @Override
    public void doPitStop() {
        System.out.println("Смени колеса!");
    }

    @Override
    public void doBestLapTime() {
        System.out.println("Сделай лучшее время.");
    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Сделай максимальную скорость.");
    }

    @Override
    public void determineType() {
        if (typeOfBody == null) {
            System.out.println("Данных недостаточно.");
        } else {
            System.out.println("Тип кузова - " + typeOfBody);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }
}
