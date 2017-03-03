/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author diego
 */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "fechanac")
    private String fecha_Nac;
    
    @Column(name = "carrera")
    private String carrera;
    
    public int get_Id_Persona(){
        return id_persona;
    }
    
    public String get_Nombre(){
        return nombre;
    }
    
    public String get_FechaNac(){
        return fecha_Nac;
    }
    
    public String get_Carrera(){
        return carrera;
    }
    
    public void set_Id_Persona(int id_persona){
        this.id_persona = id_persona;
    }
    
    public void set_Nombre(String nombre){
        this.nombre = nombre;
    }
    
    public void set_Fecha_Nac(String fecha_nac){
        this.fecha_Nac = fecha_nac;
    }
    
    public void set_Carrera(String carrera){
        this.carrera = carrera;
    }
}