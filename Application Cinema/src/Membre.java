public class Membre {
    /* Attributs de la classe */
    private int membreID;
    private int clientID;
    private String typeDeMembre;
    private String email;
    private String motDePasse;

    /* Constructeur paramétré de la classe */
    public Membre(int membreID, int clientID, String typeDeMembre, String email, String motDePasse) {
        this.membreID = membreID;
        this.clientID = clientID;
        this.typeDeMembre = typeDeMembre;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public int getMembreID() {
        return membreID;
    }

    public void setMembreID(int membreID) {
        this.membreID = membreID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getTypeDeMembre() {
        return typeDeMembre;
    }

    public void setTypeDeMembre(String typeDeMembre) {
        this.typeDeMembre = typeDeMembre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
