package org.jorgeperalta.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.jorgeperalta.webapp.model.Juego;
import org.jorgeperalta.webapp.util.JPAUtil;

public class JuegoService implements IJuegoService {

    private EntityManager em;

    public JuegoService() {
        this.em = JPAUtil.getEntityManager();
    }

    @Override
    public List<Juego> listarJuegos() {
        return em.createQuery("SELECT p FROM Juego p", Juego.class).getResultList();
    }

    @Override
    public void agregarJuego(Juego juego) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(juego);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarJuego(int juegoId) {

    }

    @Override
    public Juego buscarJuegoPorId(int juegoId) {
        Juego juego = null;
        return juego;
    }

    @Override
    public void editarJuego(Juego juego) {

    }

}
