package vista;

import controlador.ControladorCliente;
import modelo.Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    // variables globales
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    // metodos utilitarios mostrar y leer
    static String leerTexto()throws IOException {
        return in.readLine();
    }
    static void mostrarTexto(String msj){
        out.println(msj);
    }
    public static void main(String[] args) throws IOException {
        mostrarTexto("*** Bienvenido al sistema ***");
        int opcion = -1;
        do {
            mostrarMenu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        }while (opcion !=0);
    } // fin de main
    static void mostrarMenu(){
        mostrarTexto("\n" + "   Las opciones a escoger son: ");
        mostrarTexto("1. Registrar cliente");
        mostrarTexto("2. Listar clientes");
        mostrarTexto("3. Registrar camiseta");
        mostrarTexto("4. Listar camisetas");
        mostrarTexto("5. Registrar catalogo");
        mostrarTexto("6. Listar catalogos");
        mostrarTexto("0. Salir del programa");
    }// fin de mostrar menu
    static int seleccionarOpcion() throws IOException{
        mostrarTexto("Por favor indicar con numero la opcion deseada");
        return Integer.parseInt(leerTexto());
    }// fin de selec opcion
    static void procesarOpcion( int opcion) throws IOException{
        switch (opcion){
            case 0:
                mostrarTexto("Adios, vuelva pronto");
                break;
            case 1:
                registrarCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 3:
                mostrarTexto("Escogio la opcion 3 Registrar camiseta");
                break;
            case 4:
                mostrarTexto("Escogio la opcion 4 Listar camisetasr");
                break;
            case 5:
                mostrarTexto("Escogio la opcion 5 Registrar catalogo");
                break;
            case 6:
                mostrarTexto("Escogio la opcion 6 Listar catalogos");
                break;
            default:
                mostrarTexto("Opcion invalida por favor confirme la opcion deseada");
                break;
        }
    } // fin de procesar opcion

    static void registrarCliente () throws IOException{
        mostrarTexto("Escogió la opción 1 Registrar cliente");
        String resultado = ControladorCliente.registrarCliente("6", "diego", "molina",
                "trejos","heredia", "dimotre@dimotre.com");
        mostrarTexto(resultado);
    }

    static void listarClientes(){
        ArrayList<Cliente> dataCliente = ControladorCliente.listarClientes();
        for (Cliente info: dataCliente) {
            mostrarTexto(info.toString());
        }
    }
}// fin clase Main