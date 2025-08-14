public class Main {
    public static void main(String[] args) {
        // Création de deux humains
        Humain humain1 = new Humain();
        Humain humain2 = new Humain();

        // Création des cœurs
        Coeur coeur1 = new Coeur("Cœur de Pierre");
        Coeur coeur2 = new Coeur("Cœur de Lion");

        // Ajout des cœurs aux humains
        humain1.ajouterOrgane(coeur1);
        humain2.ajouterOrgane(coeur2);

        // Affichage des cœurs initiaux
        System.out.println("Humain 1 a : " + humain1.getOrganes().get(0).getNom());
        System.out.println("Humain 2 a : " + humain2.getOrganes().get(0).getNom());

        // Greffe du cœur de l'humain 1 dans l'humain 2
        humain2.greffer(humain1, coeur1);

        System.out.println("\nAprès greffe :");

        // Humain 1
        if (humain1.getOrganes().isEmpty()) {
            System.out.println("Humain 1 n'a plus d'organes.");
        } else {
            for (Organe o : humain1.getOrganes()) {
                System.out.println("Humain 1 a : " + o.getNom());
            }
        }
        
        // Humain 2
        if (humain2.getOrganes().isEmpty()) {
            System.out.println("Humain 2 n'a pas d'organes.");
        } else {
            System.out.println("Humain 2 a :");
            for (Organe o : humain2.getOrganes()) {
                System.out.println("- " + o.getNom());
            }
        }
    }
}
