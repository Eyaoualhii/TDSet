import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{

    HashSet<Enseignant> enseignants = new HashSet();
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        if ( enseignants.contains(e)){
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : enseignants){
            if (e.getId() == id){
                return  true;
            }
        }
        return false;
    }



    @Override
    public void supprimerEnseignant(Enseignant e) {
        if(e!=null) enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : enseignants) {
            System.out.println(e);
        }
    }
}
