package vista;

import controlador.ControladorCamiseta;
import controlador.ControladorCliente;
import controlador.ControladorCamiseta;
import modelo.Cliente;
import modelo.Camiseta;

import java.io.*;
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
                registrarCamiseta();
                break;
            case 4:
                listarCamisetas();
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

    static void registrarCliente (){
        mostrarTexto("Escogió la opción 1 Registrar cliente");
        String resultado = ControladorCliente.registrarCliente("6", "diego", "molina",
                "trejos","heredia", "dimotre@dimotre.com");
        mostrarTexto(resultado);
    }// fin de resgistrarCliente
    static void listarClientes(){
        ArrayList<Cliente> dataCliente = ControladorCliente.listarClientes();
        for (Cliente info: dataCliente) {
            mostrarTexto(info.toString());
        }
    }// fin listarCliente

    static void registrarCamiseta(){
        mostrarTexto("va crear y guardar una camiseta");
        String resultado = ControladorCamiseta.registrarCamiseta("1","#FFFFFF",'L',"gatitos",15000 );
        mostrarTexto(resultado);
    }

    static void listarCamisetas(){
        ArrayList<Camiseta> dataCamiseta = ControladorCamiseta.listarCamisetas();
        for (Camiseta info: dataCamiseta
             ) {
            mostrarTexto(info.toString());
        }
    }


}// fin clase Main