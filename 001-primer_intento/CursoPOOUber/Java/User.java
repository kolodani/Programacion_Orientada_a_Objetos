class User extends Account {
    public User(String name, String document, String email, String password){
        super(name, document, email, password);
    }
    void printDataUser (){
        System.out.println("documentos del Usuario :" + document +" nombre del usuario:" + name 
        + " E-mail:" + email + " Password :" + password);
    }
    
}
