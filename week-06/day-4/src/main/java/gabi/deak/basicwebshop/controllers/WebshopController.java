package gabi.deak.basicwebshop.controllers;

import gabi.deak.basicwebshop.model.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebshopController {
    List<ShopItem> shopItemList = new ArrayList<>();

    public WebshopController(){
       initializeShopItemList();
    }

    public void initializeShopItemList (){
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        shopItemList.add(new ShopItem("Coca Cola", "0.5l standard coke", 25.0, 0));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        shopItemList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
    }

    @RequestMapping("/home")
    public String setFields (Model model) {
        model.addAttribute("items", shopItemList);
        return "index";
    }
}
