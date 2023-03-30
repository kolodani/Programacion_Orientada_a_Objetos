class Driver extends Account {
    public Driver(String name, String document, String email, String password){
        super(name, document, email, password);
    }
    
    void printDataDriver() {
        System.out.println("documentos del Conductor :" + document + " nombre del conductor:" + name
                + " E-mail:" + email + " Password :" + password);
    }
}
