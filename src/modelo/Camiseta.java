package modelo;

import java.util.Objects;

public class Camiseta {
    private String itemId;
    private String codigoColor;
    private char tamanio;
    private String imagen;
    private int precio;

    public Camiseta() {
    }

    public Camiseta(String itemId, String codigoColor, char tamanio, String imagen, int precio) {
        this.itemId = itemId;
        this.codigoColor = codigoColor;
        this.tamanio = tamanio;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(String codigoColor) {
        this.codigoColor = codigoColor;
    }

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) {
        this.tamanio = tamanio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camiseta camiseta = (Camiseta) o;
        return itemId.equals(camiseta.itemId);
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "itemId='" + itemId + '\'' +
                ", codigoColor='" + codigoColor + '\'' +
                ", tamanio=" + tamanio +
                ", imagen='" + imagen + '\'' +
                ", precio=" + precio +
                '}';
    }
}// fin clase Camiseta
