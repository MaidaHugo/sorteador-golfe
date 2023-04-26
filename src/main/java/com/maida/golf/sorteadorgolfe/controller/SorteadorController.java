package com.maida.golf.sorteadorgolfe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.maida.golf.sorteadorgolfe.model.SorteadorModel;

@Controller
public class SorteadorController {

    @PostMapping("/sortearAlvo")
    private String sortear(Model model) {

        String tacoSorteado = SorteadorModel.sortearTaco();
        String alvoSorteado = SorteadorModel.sortearAlvo(tacoSorteado);

        model.addAttribute("tacoSorteado", tacoSorteado);
        model.addAttribute("alvoSorteado", alvoSorteado);

        return "home/sorteio";
    }

    @GetMapping("/")
    private String index() {
        return "home/index";
    }

}
