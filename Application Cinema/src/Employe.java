public class Employe {
    /* Attributs de la classe */
    private int employeID;
    private String emailEmploye;
    private String motDePasse;

    /* Constructeur paramétré de la classe */
    public Employe(int employeID, String emailEmploye, String motDePasse) {
        this.employeID = employeID;
        this.emailEmploye = emailEmploye;
        this.motDePasse = motDePasse;
    }

    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }

    public String getEmailEmploye() {
        return emailEmploye;
    }

    public void setEmailEmploye(String emailEmploye) {
        this.emailEmploye = emailEmploye;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
