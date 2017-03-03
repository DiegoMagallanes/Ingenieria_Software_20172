/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Persona;
import Mapeo.User;
import Modelo.PersonaDAO;
import Modelo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller 
public class Controlador {
    
    @Autowired
    PersonaDAO persona;
    
    @Autowired
    UserDAO user;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping(value="/persona", method = RequestMethod.POST)
    public ModelAndView persona(ModelMap model,HttpServletRequest request){
        String nombre = request.getParameter("email");
        Persona p = persona.getPersona(nombre);
        
        String info = "";
        if(p == null)
            model.addAttribute("info", info+"No se encontro ninguna persona con ese nombre");
        else{
            model.addAttribute("info", info+"La persona es");
            model.addAttribute("persona", p);
        }
        
        return new ModelAndView("persona", model);
    }
    
    @RequestMapping(value="/verInfo", method = RequestMethod.POST)
    public ModelAndView verInfo(ModelMap model,HttpServletRequest request){
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        model.addAttribute("email", email);
        model.addAttribute("pwd", pwd);
        
        return new ModelAndView("persona",model);
    
    }
    
    @RequestMapping(value="/datosRegistro", method = RequestMethod.POST)
    public ModelAndView datosRegistro(ModelMap model,HttpServletRequest request){
        String name = request.getParameter("name");
        String carreer = request.getParameter("carreer");
        String days = request.getParameter("days");
        String months = request.getParameter("months");
        String years = request.getParameter("years");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        model.addAttribute("name", name);
        model.addAttribute("carreer", carreer);
        model.addAttribute("days", days);
        model.addAttribute("months", months);
        model.addAttribute("years", years);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        
        return new ModelAndView("registro",model);
    }
    
    @RequestMapping(value="/registrar", method = RequestMethod.GET)
    public ModelAndView registrar(ModelMap model,HttpServletRequest request){
        return new ModelAndView("registrar",model);
    }
    
    @RequestMapping(value = "/registrarPersona", method = RequestMethod.POST)
    public ModelAndView registrarPersona(ModelMap model,HttpServletRequest request){
        Persona p  = new Persona();
        User u = new User();
        
        String name = request.getParameter("name");
        String carreer = request.getParameter("carreer");
        String days = request.getParameter("days");
        String months = request.getParameter("months");
        String years = request.getParameter("years");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        model.addAttribute("name", name);
        model.addAttribute("carreer", carreer);
        model.addAttribute("days", days);
        model.addAttribute("months", months);
        model.addAttribute("years", years);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        
        p.set_Nombre(name);
        p.set_Fecha_Nac(days + "/" + months + "/" + years);
        p.set_Carrera(carreer);
        
        persona.guardar(p);
        
        u.set_Correo(email);
        u.set_Password(password);
        u.set_Persona_Id(p);
        
        user.guardar(u);
        
        
        
        String ver_email = request.getParameter("email");
        Persona ver_p = persona.getPersona(ver_email);
        User ver_u = user.getUser(ver_email);
        
        String info = "";
        if(ver_p == null)
            return new ModelAndView("error", model);
        else
            return new ModelAndView("registro", model);
    }
}
