class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123",new Account("Andres Herrera", "3333333"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567",new Account("Andrea Herrera", "4444444"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}
