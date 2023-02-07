package com.example.MobileMK.controller;
import com.example.MobileMK.repository.brandRepo;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class controller {
    private final brandRepo BrandRepo;

    public controller(brandRepo brandRepo) {
        BrandRepo = brandRepo;
    }

    @GetMapping("/")
    public String viewMainPage(Model model) {
        return "MainPage";
    }

    @GetMapping("/MainPage")
    public <brandEntitys> String listbrandEntitys(Model model){
        List<brandEntitys> brandEntitys = null;
      
        model.addAttribute("brandEntitys", brandEntitys);
        return "MainPage";
    }


}