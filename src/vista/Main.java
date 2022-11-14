package vista;

import controlador.ControladorCamiseta;
import controlador.ControladorCatalogo;
import controlador.ControladorCliente;
import controlador.ControladorCamiseta;
import data.DataCatalogo;
import modelo.Catalogo;
import modelo.Cliente;
import modelo.Camiseta;

import javax.xml.catalog.Catalog;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        mostrarTexto("7. Incluir Camiseta");
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
                registarCatalogo();
                break;
            case 6:
                listarCatalogos();
                break;
            case 7:
                incluirCamiseta();
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
        int numCamiseta;
        for (Camiseta info: dataCamiseta) {
            numCamiseta = dataCamiseta.indexOf(info)+1;
            mostrarTexto(numCamiseta +"=>"+  info.toString());
        }
    }
    static void registarCatalogo() {
        mostrarTexto("Va a crear un catalogo");
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formaFecha = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fechaCreacion = hoy.format(formaFecha);
        String anio = Integer.toString(hoy.getYear());
        String mes = hoy.getMonth().toString();
        String nombreCatalogo = mes+anio;
        mostrarTexto(fechaCreacion);
        mostrarTexto(nombreCatalogo);
        String resultado = ControladorCatalogo.registrarCatalogo(nombreCatalogo, fechaCreacion );
        mostrarTexto(resultado);
    }

    static void listarCatalogos(){
        ArrayList<Catalogo> dataCatalogos = ControladorCatalogo.listarCatalogos();
        int numCatalogo;
        for (Catalogo info : dataCatalogos) {
            numCatalogo = dataCatalogos.indexOf(info)+1;
            mostrarTexto(numCatalogo +"=>"+ info.toString());
        }
    }

    private static void incluirCamiseta() throws IOException {
        listarCatalogos();
        mostrarTexto("ingrese numero de catalogo a modificar");
        int numCatalogo = Integer.parseInt(leerTexto());
        listarCamisetas();
        mostrarTexto("ingrese numero de camiseta");
        int numCamiseta = Integer.parseInt(leerTexto());
        mostrarTexto(ControladorCatalogo.incluirCamiseta(numCatalogo, numCamiseta));
    }



}// fin clase Main