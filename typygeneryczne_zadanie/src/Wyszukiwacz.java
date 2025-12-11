import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Wyszukiwacz<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T znajdzMaksymalny(List<T> lista) {

        T maksymalny = lista.get(0);
        for (T element : lista) {
            if (element.compareTo(maksymalny) > 0) {
                maksymalny = element;
            }
        }
        return maksymalny;
    }

    public static <T extends Comparable<T>> List<T> sortuj(List<T> lista) {

        List<T> posortowana = new ArrayList<>(lista);

        Collections.sort(posortowana);

        return posortowana;
    }
}
