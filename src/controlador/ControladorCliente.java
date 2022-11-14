package controlador;
import data.DataClientes;
import modelo.Cliente;

import java.util.ArrayList;

public class ControladorCliente {
    // controlador de Cliente

    private static Cliente cliente;
    private static DataClientes listaClientes;


    public static String registrarCliente(String id, String nombre, String primerApellido,
                                          String segundoApellido, String direccion, String email){
        if (listaClientes == null){
            listaClientes = new DataClientes();
        }
        cliente = new Cliente(id, nombre, primerApellido, segundoApellido, direccion, email);
        return listaClientes.guardarCliente(cliente);
    }

    public static ArrayList<Cliente> listarClientes(){
        return listaClientes.verClientes();
    }
}// fin clase cliente

