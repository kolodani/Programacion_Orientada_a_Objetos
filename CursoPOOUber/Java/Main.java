class Main {
    public static void main(String[] args) {
        System.out.println("conductor uber");
        Car car = new Car ("AMQ123", new Account("Andres Herrera", "AND123","andresl@hotmail.com","123459"));
        car.passenger = 4;
        car.printDataCar();
        
        System.out.println("conductor UberX");
        UberX uberX = new UberX("MNB321", new Account("Ana ferran", "HGF852", "analita@hotmail.com", "987456"),"Toyota", "corolla");
        uberX.passenger = 4;
        uberX.printDataUberX();
        
        System.out.println("Usuario");
        User user = new User("jorge pedro", "35.214.369", "rialputo@gmail.com", "MeLaComo");
        user.printDataUser();
    }
}