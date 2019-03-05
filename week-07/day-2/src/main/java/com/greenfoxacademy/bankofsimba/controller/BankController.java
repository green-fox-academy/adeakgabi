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
    }

    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion");

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccount (Model model){
        model.addAttribute("bankAccount1", bankAccount1);
        return "index";
    }

}
