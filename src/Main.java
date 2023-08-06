public class Main {
    public static void main(String[] args) {
        CarPart engine = new CarPart("Engine");
        Model carModel = new Model("Sedan", CarModelType.SEDAN);

        Car carA = new Car("Company A", 2000, "Car A", engine, carModel);
        Car carB = new Car("Company B", 1995, "Car B", engine, carModel);
        Car carC = new Car("Company C", 2010, "Car C", engine, carModel);

        Car[] cars = {carA, carB, carC};

        for (Car car : cars) {
            System.out.println("Company: " + car.getCompanyName());
            System.out.println("Year Founded: " + car.getYearFounded());
            System.out.println("Car Name: " + car.getCarName());
            System.out.println("Car Part: " + car.getCarPart().getName());
            System.out.println("Car Model: " + car.getCarModel().getModelName() + ", Type: " + car.getCarModel().getModelType());
            car.printInfo();
            car.printInfo("Additional Info for " + car.getCarName());
            System.out.println();
        }
    }
}