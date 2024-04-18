public class Reservation {
    /* Attributs de la classe */
    private int reservationID;
    private int filmID;
    private int clientID;
    private int nombreBillets;
    private double prixTotal;

    /* Constructeur paramétré de la classe */
    public Reservation(int reservationID, int filmID, int clientID, int nombreBillets, double prixTotal) {
        this.reservationID = reservationID;
        this.filmID = filmID;
        this.clientID = clientID;
        this.nombreBillets = nombreBillets;
        this.prixTotal = prixTotal;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getNombreBillets() {
        return nombreBillets;
    }

    public void setNombreBillets(int nombreBillets) {
        this.nombreBillets = nombreBillets;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }
}
