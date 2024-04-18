public class Film {
    /* Attributs de la classe Film */
    private int filmID;
    private String titre;
    private String realisateur;
    private String synopsis;
    private double prixTicket;
    private String salle;
    private double notePresse;
    private double moyenneNotesMembres;
    private double moyenneNotesEmployes;
    private String poster;

    /* Constructeur paramétré de la classe Film */
    public Film(int filmID, String titre, String realisateur, String synopsis, double prixTicket, String salle, double notePresse, double moyenneNotesMembres, double moyenneNotesEmployes, String poster) {
        this.filmID = filmID;
        this.titre = titre;
        this.realisateur = realisateur;
        this.synopsis = synopsis;
        this.prixTicket = prixTicket;
        this.salle = salle;
        this.notePresse = notePresse;
        this.moyenneNotesMembres = moyenneNotesMembres;
        this.moyenneNotesEmployes = moyenneNotesEmployes;
        this.poster = poster;
    }

    /* Getters et Setters de la classe Film */
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getPrixTicket() {
        return prixTicket;
    }

    public void setPrixTicket(double prixTicket) {
        this.prixTicket = prixTicket;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public double getNotePresse() {
        return notePresse;
    }

    public void setNotePresse(double notePresse) {
        this.notePresse = notePresse;
    }

    public double getMoyenneNotesMembres() {
        return moyenneNotesMembres;
    }

    public void setMoyenneNotesMembres(double moyenneNotesMembres) {
        this.moyenneNotesMembres = moyenneNotesMembres;
    }

    public double getMoyenneNotesEmployes() {
        return moyenneNotesEmployes;
    }

    public void setMoyenneNotesEmployes(double moyenneNotesEmployes) {
        this.moyenneNotesEmployes = moyenneNotesEmployes;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
