package com.africafuture.jokesapp.controller;

import com.africafuture.jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/", ""})
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public String getJoke(Model model) {

        model.addAttribute("joke", jokesService.getAJoke());
        return "chucknorris";

    }
}
