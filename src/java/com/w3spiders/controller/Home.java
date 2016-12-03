package com.w3spiders.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dinush
 */
@Controller
public class Home {
    
    @RequestMapping(value = "/index.so", method = RequestMethod.GET)
    public String index(ModelMap model) throws Exception {
         return "index";
    }
}
