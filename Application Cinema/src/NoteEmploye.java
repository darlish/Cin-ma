public class NoteEmploye {
    /* Attributs de la classe */
    private int noteID;
    private int filmID;
    private int employeID;
    private double note;

    /* Constructeur paramétré de la classe */
    public NoteEmploye(int noteID, int filmID, int employeID, double note) {
        this.noteID = noteID;
        this.filmID = filmID;
        this.employeID = employeID;
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

    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
