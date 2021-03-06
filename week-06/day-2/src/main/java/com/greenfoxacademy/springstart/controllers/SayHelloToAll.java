package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SayHelloToAll {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};



    public String getRandomColor() {
        String letters = "0123456789ABCDEF";
        String color = "#";
        for (int i = 0; i < 6; i++) {
            color += letters.charAt((int) Math.floor(Math.random() * letters.length()));
        }
        return color;
    }

    public String getRandomFontSize(){
        return Math.floor((Math.random() * 41) + 12)+"px";
    }

    @RequestMapping("/web/greeting")
    public String greeting (Model model) {
        int randomIndex = (int)(Math.random() * ((hellos.length - 2) + 1) + 1);
        model.addAttribute("hellos", hellos[randomIndex]);
        model.addAttribute("color", getRandomColor());
        model.addAttribute("fontSize", getRandomFontSize());

        return "greeting" ;
    }
}
