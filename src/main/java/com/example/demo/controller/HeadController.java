package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Контроллер стартовой страницы для выбора категории продукта.
 */
@RequestMapping("/")
@Controller
public class HeadController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String showStartPage(Model model) {
        return "index";
    }
}