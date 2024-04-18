public class Reduction {
    /* Attributs de la classe */
    private int reductionID;
    private String typeDeMembre;
    private double valeurReduction;

    /* Constructeur paramétré de la classe */
    public Reduction(int reductionID, String typeDeMembre, double valeurReduction) {
        this.reductionID = reductionID;
        this.typeDeMembre = typeDeMembre;
        this.valeurReduction = valeurReduction;
    }

    public int getReductionID() {
        return reductionID;
    }

    public void setReductionID(int reductionID) {
        this.reductionID = reductionID;
    }

    public String getTypeDeMembre() {
        return typeDeMembre;
    }

    public void setTypeDeMembre(String typeDeMembre) {
        this.typeDeMembre = typeDeMembre;
    }

    public double getValeurReduction() {
        return valeurReduction;
    }

    public void setValeurReduction(double valeurReduction) {
        this.valeurReduction = valeurReduction;
    }
}
