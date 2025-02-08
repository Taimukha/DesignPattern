import java.util.ArrayList;
import java.util.List;

public class AdversaryManager {
    private List<Adversary> adversaries;

    public AdversaryManager() {
        adversaries = new ArrayList<>();
    }

    public void spawnAdversary(Adversary adversary) {
        adversaries.add(adversary);
        System.out.println("Spawned adversary: " + adversary.getCategory());
    }

    public void removeAdversary(Adversary adversary) {
        adversaries.remove(adversary);
        System.out.println("Removed adversary: " + adversary.getCategory());
    }

    public List<Adversary> getAdversaries() {
        return adversaries;
    }
}
