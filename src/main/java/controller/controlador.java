package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import interfaces.Iproductooucr;
import interfazservices.Iproductoservice;
import modelos.productoOUCR;

@Controller
@RequestMapping
public class controlador {
    @Autowired
    private Iproductoservice service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<productoOUCR>productos =  service.Listar();
        model.addAttribute("productos", productos);
        return "index";
    }

}
