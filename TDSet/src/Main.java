import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Enseignant e1 = new Enseignant(1,"nom1","prenom1");
        Enseignant e2 = new Enseignant(2,"nom2","prenom2");
        Enseignant e3 = new Enseignant();
        EspritHashSet hash = new EspritHashSet();
        hash.ajouterEnseignant(e1);
        hash.ajouterEnseignant(e2);
        hash.ajouterEnseignant(e3);
        System.out.println("Set des enseignants : ");
        hash.displayEnseignants();
        System.out.println(hash.rechercherEnseignant(e1.getId()));
        System.out.println(hash.rechercherEnseignant(e2));
        hash.supprimerEnseignant(e3);
        System.out.println("Set des enseignants aprés suppression de e3 :");
        hash.displayEnseignants();



        EspritTreeSet treeset = new  EspritTreeSet();
        treeset.ajouterEnseignant(e1);
        treeset.ajouterEnseignant(e2);
        treeset.ajouterEnseignant(e3);
        System.out.println("Set des enseignants triée : ");
        treeset.displayEnseignants();
        System.out.println(treeset.rechercherEnseignant(e1.getId()));
        System.out.println(treeset.rechercherEnseignant(e2));
        treeset.supprimerEnseignant(e3);
        System.out.println("Set des enseignants trié aprés suppression de e3 : ");
        treeset.displayEnseignants();

        TreeSet<Enseignant> treesetParNomC = new TreeSet(new TriParNom());
        treesetParNomC.addAll(treeset.enseignants);
        System.out.println("Set des enseignants trié par nom croissant : ");
        System.out.println(treesetParNomC);

        TreeSet<Enseignant> treesetParIdDec = new TreeSet();
        treesetParIdDec.addAll(treeset.enseignants);
        System.out.println("Set des enseignants trié par id décroissant : ");
        System.out.println(treesetParIdDec);

    }
}