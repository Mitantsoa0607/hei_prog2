package appartement;

import java.util.ArrayList;
import java.util.List;

class Immeuble extends Endroit {
    private int nombreEtages;
    protected List<Appartement> appartements;

    public Immeuble(String id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
        this.appartements = new ArrayList<>();
    }

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }
}