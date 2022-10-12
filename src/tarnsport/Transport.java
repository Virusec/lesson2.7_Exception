package tarnsport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        if (isNull(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (isNull(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isNull(String value) {
        return value == null || value.isBlank();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void finishMoving();


    public void printInfo() {
        System.out.println(getClass()
                + " (Марка - " + getBrand()
                + ", модель - " + getModel()
                + ", объем двигателя: " + getEngineVolume()
                + ".)");
    }

    public abstract boolean passDiagnostics();
}
