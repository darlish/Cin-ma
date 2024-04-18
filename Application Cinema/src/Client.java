public class Client {
    /* Attributs de la classe */
    private int clientID;
    private String typeDeClient;

    /* Constructeur paramétré de la classe */
    public Client(int clientID, String typeDeClient) {
        this.clientID = clientID;
        this.typeDeClient = typeDeClient;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getTypeDeClient() {
        return typeDeClient;
    }

    public void setTypeDeClient(String typeDeClient) {
        this.typeDeClient = typeDeClient;
    }
}
