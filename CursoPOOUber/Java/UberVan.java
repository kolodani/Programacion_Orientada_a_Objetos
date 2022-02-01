class UberVan extends Car {
    String typeCarAccepted;
    String seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver, String typeCarAccepted, String seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    void printDataVan() {
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Tipo de auto: " 
        + typeCarAccepted + " Material de los asientos: " + seatsMaterial);
    }
    
    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}