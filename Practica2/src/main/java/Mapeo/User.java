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
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int id_user;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "password")
    private String password;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpersona")
    private Persona persona_id;
    
    public int get_Id_User(){
        return id_user;
    }
    
    public String get_Correo(){
        return correo;
    }
    
    public String get_Password(){
        return password;
    }
    
    public Persona get_Persona_Id(){
        return persona_id;
    }
    
    public void set_Id_User(int id_user){
        this.id_user = id_user;
    }
    
    public void set_Correo(String correo){
        this.correo = correo;
    }
    
    public void set_Password(String password){
        this.password = password;
    }
    
    public void set_Persona_Id(Persona persona_id){
        this.persona_id = persona_id;
    }
}