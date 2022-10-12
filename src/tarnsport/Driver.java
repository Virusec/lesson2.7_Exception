package tarnsport;

public class Driver<A extends Transport> {
    private final String name;
    public A transport;
    private String driverLicense;
    private int experience;

    public Driver(String name, String driverLicense, int experience, A transport) {
        if (isNull(name)) {
            this.name = "default";
        } else {
            this.name = name;
        }
        setDriverLicense(driverLicense);
        setExperience(experience);
        setTransport(transport);
    }

    public A getTransport() {
        return transport;
    }

    public void setTransport(A transport) {
        boolean a;
        switch (getDriverLicense()) {
            case "B":
                a = transport instanceof Car;
                break;
            case "C":
                a = transport instanceof Truck;
                break;
            case "D":
                a = transport instanceof Bus;
                break;
            default:
                a = false;
        }
        if (a) {
            this.transport = transport;
        } else {
            throw new IllegalArgumentException(getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (isNull(driverLicense)) {
           throw  new IllegalArgumentException("Укажите категорию прав!");
        } else {
            this.driverLicense = driverLicense;
        }
    }

    private boolean isNull(String value) {
        return value == null || value.isBlank();
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 0);
    }

    public void startMoving(A transport) {
        System.out.println("Начать движение на " + transport.getBrand() + " " + transport.getModel());
    }

    public void stop(A transport) {
        System.out.println("Остановиться на " + transport.getBrand() + " " + transport.getModel());
    }

    public void refuel(A transport) {
        System.out.println("Заправить " + transport.getBrand() + " " + transport.getModel());
    }
}
