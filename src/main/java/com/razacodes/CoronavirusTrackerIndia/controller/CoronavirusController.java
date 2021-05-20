package com.razacodes.CoronavirusTrackerIndia.controller;

import com.razacodes.CoronavirusTrackerIndia.Service.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoronavirusController {
    @Autowired
    private CoronavirusDataService coronavirusDataService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("allStats", coronavirusDataService.getAllStats());
        return "index";
    }
}
