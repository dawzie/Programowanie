import java.util.List;
import java.util.Arrays;


    public static void main(String[] args) {

        List<Integer> listaLiczb = Arrays.asList(12, 21, 54, 3);

        Integer maxLiczba = Wyszukiwacz.znajdzMaksymalny(listaLiczb);
        System.out.println("Maksymalny element: " + maxLiczba);

        List<Integer> posortowaneLiczby = Wyszukiwacz.sortuj(listaLiczb);
        System.out.println("Posortowana lista: " + posortowaneLiczby);

        List<String> listaImion = Arrays.asList("Ela", "Kacper", "Wiktor", "Ania");

        String maxImie = Wyszukiwacz.znajdzMaksymalny(listaImion);
        System.out.println("Maksymalny element: " + maxImie);

        List<String> posortowaneImiona = Wyszukiwacz.sortuj(listaImion);
        System.out.println("Posortowana lista: " + posortowaneImiona);

    }

