package Portafolio.Portafolio.controller;

import Portafolio.Portafolio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/")
    public String listado(Model model) {
        var lista=productoService.getProductos(true);        
        model.addAttribute("productos", lista);        
        return "/index";
    }
}
