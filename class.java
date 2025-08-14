import java.util.ArrayList;
import java.util.List;

class Vetement {
}

class Chemise extends Vetement {
}

class Organe {
    private String nom;

    public Organe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

class Coeur extends Organe {
    public Coeur(String nom) {
        super(nom);
    }
}

class Humain {
    private List<Organe> organes;
    private List<Organe> greffes;
    private List<Vetement> vetements;

    public Humain() {
        organes = new ArrayList<>();
        greffes = new ArrayList<>();
        vetements = new ArrayList<>();
    }

    public void ajouterOrgane(Organe o) {
        organes.add(o);
    }

    public void greffer(Humain donneur, Organe o) {
        if(donneur.getOrganes().remove(o)) { // Retire l'organe du donneur
            greffes.add(o);                  // Garde une trace de la greffe
            organes.add(o);                  // Ajoute l'organe au receveur
            System.out.println("Greffe réussie : " + o.getNom() + " transféré de donneur à receveur.");
        } else {
            System.out.println("Erreur : l'organe n'existe pas chez le donneur.");
        }
    }

    public List<Organe> getOrganes() {
        return organes;
    }
}

