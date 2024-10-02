package appartement;

public class main {
    public static void main(String[] args) {
        Quartier quartier = new Quartier("Q1", "Ivandry");
        Immeuble immeuble = new Immeuble("I1", "Jade", 5);
        Immeuble immeuble1 = new Immeuble("I2", "Bureau", 7);


        Appartement appartement1 = new Appartement(
                "A1",
                "Appartement 1",
                "Description de l'appartement 1",
                500,
                "libre",
                immeuble);
        Appartement appartement2 = new Appartement(
                "A2",
                "Appartement 2",
                "Description de l'appartement 2",
                800,
                "occupé",
                immeuble);
        Appartement appartement3 = new Appartement(
                "A3",
                "Appartement 2",
                "Description de l'appartement 3 ",
                1000,
                "en cours de libération",
                immeuble1
        );
        immeuble.ajouterAppartement(appartement1);
        immeuble.ajouterAppartement(appartement2);
        immeuble.ajouterAppartement(appartement3);


        quartier.ajouterImmeuble(immeuble);

        System.out.println("Nombre d'appartements dans le quartier : " + quartier.getNom() + " = " + +quartier.compterAppartements());
        System.out.println("L'appartement est dans le quartier : " + quartier.appartementDansQuartier(appartement1));
    }
}
