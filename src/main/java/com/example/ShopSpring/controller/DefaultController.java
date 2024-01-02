package com.example.ShopSpring.controller;


import com.example.ShopSpring.entity.ProductType;
import com.example.ShopSpring.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {


    @Autowired
    ProductTypeRepository productTypeRepository;

    @GetMapping("/")
    public String index (Model model) {
        Iterable<ProductType> types =productTypeRepository.findAll();
        model.addAttribute("types",types);
        return "index";
    }

}
