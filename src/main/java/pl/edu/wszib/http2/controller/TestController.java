package pl.edu.wszib.http2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("imie", "Mateusz");
        model.addAttribute("pokaz", false);
        model.addAttribute("kolory",
                Arrays.asList("Niebieski", "Żółty", "Czerwony"));
        model.addAttribute("teraz", new Date());
        return "test";
    }
}


