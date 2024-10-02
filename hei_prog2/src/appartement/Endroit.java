package appartement;

abstract class Endroit {
    private String id;
    private String nom;

    public Endroit(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }
    public abstract int compterAppartements();
}

