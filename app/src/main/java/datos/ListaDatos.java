package datos;

import java.util.ArrayList;

public class ListaDatos {
    private static ArrayList<Villano> listaVillanos = new ArrayList<>();
    public  static ArrayList<Villano> getListaVillanos() {
        return  listaVillanos;
    }

    public static void setListaVillanos(ArrayList<Villano> listaVillanos) {
        ListaDatos.listaVillanos = listaVillanos;
    }
}
