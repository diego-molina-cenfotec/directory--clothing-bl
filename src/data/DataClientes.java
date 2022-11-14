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
        return "Cliente guardado";
    }

    public ArrayList<Cliente> verClientes(){
        return listaClientes;
    }

}// fin clase DataCliente
