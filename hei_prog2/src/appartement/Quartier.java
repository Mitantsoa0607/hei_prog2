package appartement;

import java.util.ArrayList;
import java.util.List;

class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    public boolean appartementDansQuartier(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.compterAppartements() > 0) {
                for (Appartement app : immeuble.appartements) {
                    if (app.getId().equals(appartement.getId())) {

                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }
}
//p