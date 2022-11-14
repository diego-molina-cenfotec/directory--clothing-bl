package data;

import modelo.Camiseta;
import modelo.Cliente;

import java.util.ArrayList;

public class DataCamisetas {
    // almacenamiento de camisetas
    private Camiseta camiseta;
    private ArrayList listaCamisetas;

    public DataCamisetas() {
    }

    public String guardarCamiseta(Camiseta camiseta){
        if (listaCamisetas == null){
            listaCamisetas = new ArrayList<Camiseta>();
        }
        listaCamisetas.add(camiseta);
        return "camiseta guardada";
    }

    public ArrayList<Camiseta> verCamisetas(){
        return listaCamisetas;
    }
}// fin clase DataCamiseta
