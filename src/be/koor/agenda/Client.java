package be.koor.agenda;

public class Client extends Person{

    private int idClient;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        if (idClient < 0){
            throw new RuntimeException("L'id du client doit être psositif");
        }
        this.idClient = idClient;
    }
}
