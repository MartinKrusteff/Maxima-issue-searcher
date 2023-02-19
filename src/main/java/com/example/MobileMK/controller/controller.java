package com.example.MobileMK.controller;
import com.example.MobileMK.model.entity.BrandEntity;
import com.example.MobileMK.repository.brandRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class controller {
@Autowired
    private brandRepo BrandRepo;
    @GetMapping("/MainPage")
    public String listBrandEntities(Model model, String keyword){
        List<BrandEntity> brandEntities = keyword == null ? BrandRepo.findAll() : BrandRepo.findByKeyword(keyword);

        model.addAttribute("brandEntities", brandEntities);

        return "MainPage";
    }
    @GetMapping("/")
    public String viewMainPage(Model model) {
        return "MainPage";
    }
    @GetMapping("/AddProblem")
    public String moviePage() {
        return "AddProblem";
    }
    @PostMapping("/addProblem")
    public String showMovieForm(BrandEntity brandEntity) {
        BrandRepo.saveAndFlush(brandEntity);
        return "AddProblem";
    }

}