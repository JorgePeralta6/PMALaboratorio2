package org.jorgeperalta.webapp.service;

import java.util.List;
import org.jorgeperalta.webapp.model.Juego;


public interface IJuegoService {
    
    public List<Juego> listarJuegos();
    
    public void agregarJuego(Juego juego);
    
    public void eliminarJuego(int juegoId);
    
    public Juego buscarJuegoPorId(int juegoId);
    
    public void editarJuego(Juego juego);

    
}
