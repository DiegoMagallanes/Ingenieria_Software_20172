/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
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
}
