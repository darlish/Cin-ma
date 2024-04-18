public class NoteMembre {
    /* Attributs de la classe */
    private int noteID;
    private int filmID;
    private int membreID;
    private double note;

    /* Constructeur paramétré de la classe */
    public NoteMembre(int noteID, int filmID, int membreID, double note) {
        this.noteID = noteID;
        this.filmID = filmID;
        this.membreID = membreID;
        this.note = note;
    }

    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public int getMembreID() {
        return membreID;
    }

    public void setMembreID(int membreID) {
        this.membreID = membreID;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
