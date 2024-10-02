package appartement;

class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyer;
    private String statut;
    private Endroit endroit;

    public Appartement(String id, String titre, String description, double loyer, String statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyer = loyer;
        this.statut = statut;
        this.endroit = endroit;
    }

    public String getId() {
        return this.id;
    }

    public Endroit getEndroit() {
        return this.endroit;
    }
}


