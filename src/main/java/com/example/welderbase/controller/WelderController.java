package com.example.welderbase.controller;

import com.example.welderbase.service.WelderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welder")
public class WelderController {

    private final WelderServiceImpl welderService;

    public WelderController(WelderServiceImpl welderService) {
        this.welderService = welderService;
    }

    @RequestMapping({"","/welder","/","/index.html"})
    public String welderList(Model model){
        model.addAttribute("welder",welderService.findAll());
        return "welder/index";
    }


}
