
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * A provider class that houses all animation objects that implement JTray
 */
public class AnimationProvider {

    private List<JTray> animationsList;

    public AnimationProvider(JTray... animations) {
        animationsList = new ArrayList<>();
        Collections.addAll(animationsList, animations);
    }

    public void addAll(JTray... animations) {
        Collections.addAll(animationsList, animations);
    }

    public JTray get(int index) {
        return animationsList.get(index);
    }

    public JTray findFirstWhere(Predicate<? super JTray> predicate) {
        return animationsList.stream().filter(predicate).findFirst().orElse(null);
    }

    public List<JTray> where(Predicate<? super JTray> predicate) {
        return animationsList.stream().filter(predicate).collect(Collectors.toList());
    }
}