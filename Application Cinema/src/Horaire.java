import java.util.Date;
import java.sql.Time;

public class Horaire {
    /* Attributs de la classe */
    private int horaireID;
    private int filmID;
    private Date dateHoraire;
    private Time heureHoraire;

    /* Constructeur paramétré de la classe */
    public Horaire(int horaireID, int filmID, Date dateHoraire, Time heureHoraire) {
        this.horaireID = horaireID;
        this.filmID = filmID;
        this.dateHoraire = dateHoraire;
        this.heureHoraire = heureHoraire;
    }

    public int getHoraireID() {
        return horaireID;
    }

    public void setHoraireID(int horaireID) {
        this.horaireID = horaireID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public Date getDateHoraire() {
        return dateHoraire;
    }

    public void setDateHoraire(Date dateHoraire) {
        this.dateHoraire = dateHoraire;
    }

    public Date getHeureHoraire() {
        return heureHoraire;
    }

    public void setHeureHoraire(Time heureHoraire) {
        this.heureHoraire = heureHoraire;
    }
}
