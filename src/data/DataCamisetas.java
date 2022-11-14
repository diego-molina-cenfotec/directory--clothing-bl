package data;

import modelo.Camiseta;
import modelo.Catalogo;

import java.util.ArrayList;

public class DataCamisetas {
    // almacenamiento de camisetas
    private Camiseta camiseta;
    private static ArrayList<Camiseta> listaCamisetas;

    public DataCamisetas() {
    }

    public String guardarCamiseta(Camiseta camiseta){
        if (listaCamisetas == null){
            listaCamisetas = new ArrayList<Camiseta>();
        }
        listaCamisetas.add(camiseta);
        // solo para pruebas, datos quemados
        Camiseta camiseta1 = new Camiseta("2", "#3355FF", 'M', "perros", 20000);
        listaCamisetas.add(camiseta1);
        // hasta aqui borrar
        return "camiseta guardada";
    }

    public static ArrayList<Camiseta> verCamisetas(){
        return listaCamisetas;
    }

    public static Camiseta clonarCamiseta(int numCamiseta){
        ArrayList<Camiseta> camisetas = verCamisetas();
       Camiseta estaCamiseta = listaCamisetas.get(numCamiseta);
        return estaCamiseta;
    }
}// fin clase DataCamiseta
