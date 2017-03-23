/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Mapeo.Persona;
import Mapeo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author diego
 */


public class UserDAO{
    //Atributo para una nueva sesion
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    /**
     * Guarda a un usuario en la base de datos.
     * @param user
     */
    public void guardar(User user){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.persist(user);
            tx.commit();
        }
        catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
    
    /**
     * Actualiza a un User de la base de datos.
     * @param user
     */
    public void actualizar(User user) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.update(user);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    }
    
    /**
     * Elimina a un User de la base de datos.
     * @param user
     */
    public void eliminar(User user) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.delete(user);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    }
    
    
    public User getUser(String nombre) {
        User user = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = " from User where correo = :nombre";
            Query query = session.createQuery(hql);
            query.setParameter("nombre", nombre);
            user = (User)query.uniqueResult();
            tx.commit();
           
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return user;
    }
}