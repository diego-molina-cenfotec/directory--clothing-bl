package modelo;

import data.DataCamisetas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Catalogo {
    private String nombreCatalogo; // ej: enero2022
    private String fechaCreacion;
    private ArrayList<Camiseta> coleccionCamisetas;

    public Catalogo() {
    }

    public Catalogo(String nombreCatalogo, String fechaCreacion) {
        this.nombreCatalogo = nombreCatalogo;
        this.fechaCreacion = fechaCreacion;
        coleccionCamisetas = new ArrayList<Camiseta>();
    }

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Camiseta> getColeccionCamisetas() {
        return coleccionCamisetas;
    }

    public void setColeccionCamisetas(ArrayList<Camiseta> coleccionCamisetas) {
        this.coleccionCamisetas = coleccionCamisetas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogo catalogo = (Catalogo) o;
        return nombreCatalogo.equals(catalogo.nombreCatalogo);
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "nombreCatalogo='" + nombreCatalogo + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", coleccionCamisetas=" + coleccionCamisetas +
                '}';
    } 
}// fin Catalogo
