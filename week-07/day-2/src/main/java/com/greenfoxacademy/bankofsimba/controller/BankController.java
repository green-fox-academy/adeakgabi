package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankController(){
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
        bankAccounts.add(new BankAccount("Pumba", 1000, "warthog"));
        bankAccounts.add(new BankAccount("Timon", 500, "meerkat"));
        bankAccounts.add(new BankAccount("Mufasa", 2500, "lion"));
        bankAccounts.add(new BankAccount("Scar", 3000, "lion"));
        bankAccounts.add(new BankAccount("Nala", 2100, "lion"));
    }

    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion");

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccount (Model model){
        model.addAttribute("bankAccount1", bankAccount1);
        return "index";
    }

    @RequestMapping("/text")
    public String displayString (Model model){
       model.addAttribute("formatted",  "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
      return "displayString";
    }

    @RequestMapping("/list")
    public String listAccounts (Model model){
        model
    }

}
