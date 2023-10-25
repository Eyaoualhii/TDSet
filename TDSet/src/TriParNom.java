import java.util.Comparator;

public class TriParNom implements Comparator<Enseignant> {
    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
