class Car extends Company {
    private String carName;
    private CarPart carPart;
    private Model carModel;

    public Car(String companyName, int yearFounded, String carName, CarPart carPart, Model carModel) {
        super(companyName, yearFounded);
        this.carName = carName;
        this.carPart = carPart;
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public CarPart getCarPart() {
        return carPart;
    }

    public Model getCarModel() {
        return carModel;
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Car: " + carName + ", Additional Info: " + additionalInfo);
    }
}