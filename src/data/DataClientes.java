package data;

import modelo.Cliente;
import java.util.ArrayList;

public class DataClientes {
    // almacenamiento de clientes
    private static Cliente cliente;
    private ArrayList listaClientes;

    public DataClientes() {
    }

    public String guardarCliente (Cliente cliente){
        if (listaClientes == null){
            listaClientes = new ArrayList<Cliente>();
        }
        listaClientes.add(cliente);
        return "Cliente guardo";
    }

    public ArrayList<Cliente> verClientes(){
        /*ArrayList<String> infoClientes = new ArrayList<>();
        for (Object c : listaClientes) {
            infoClientes.add(c.toString());
        }*/
        return listaClientes;
    }

}// fin clase DataCliente
