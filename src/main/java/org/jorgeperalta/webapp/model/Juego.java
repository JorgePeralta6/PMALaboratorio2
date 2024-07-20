package org.jorgeperalta.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Juegos")
public class Juego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int juegoId;
    private String nombreJuego;
    private String marcaJuego;
    private double precio;

    public Juego() {
    }

    public Juego(String nombreJuego, String marcaJuego, double precio) {
        this.nombreJuego = nombreJuego;
        this.marcaJuego = marcaJuego;
        this.precio = precio;
    }

    public Juego(int juegoId, String nombreJuego, String marcaJuego, double precio) {
        this.juegoId = juegoId;
        this.nombreJuego = nombreJuego;
        this.marcaJuego = marcaJuego;
        this.precio = precio;
    }

    public int getJuegoId() {
        return juegoId;
    }

    public void setJuegoId(int juegoId) {
        this.juegoId = juegoId;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getMarcaJuego() {
        return marcaJuego;
    }

    public void setMarcaJuego(String marcaJuego) {
        this.marcaJuego = marcaJuego;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Juego{" + "juegoId=" + juegoId + ", nombreJuego=" + nombreJuego + ", marcaJuego=" + marcaJuego + ", precio=" + precio + '}';
    }
    
    
}
