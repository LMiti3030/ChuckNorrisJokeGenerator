package mititelu.laura.sfg.cnjg.chucknorrisjokegenerator.controllers;

import mititelu.laura.sfg.cnjg.chucknorrisjokegenerator.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LMiti3030
 * created on 02.12.2022
 */

@Controller
public class JokesController {

    QuoteService quoteService;

    public JokesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getQuote(Model model){
        model.addAttribute("joke", quoteService.getRandomQuote());

        return "jokes/index";
    }

}
